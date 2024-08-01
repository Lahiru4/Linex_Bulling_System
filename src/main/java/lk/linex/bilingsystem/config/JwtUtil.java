package lk.linex.bilingsystem.config;

import io.jsonwebtoken.*;
import jakarta.servlet.http.HttpServletRequest;
import lk.linex.bilingsystem.dto.UserDTO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

@Component
public class JwtUtil {
    private final String secret_key;
    private long accessTokenValidity = 1*60*24;
    private final JwtParser jwtParser;
    private final String TOKEN_HEADER = "Authorization";
    private final String TOKEN_PREFIX = "Bearer ";

    public JwtUtil(@Value("${application.secret}") String secret_key) {
        this.secret_key = secret_key;
        this.jwtParser = Jwts.parser().setSigningKey(secret_key);
    }
    public String createToken(UserDTO user) {
        Claims claims = Jwts.claims().setSubject(user.getEmail());
        claims.put("userName",user.getUserName());
        claims.put("role",user.getRole());
        Date tokenCreateTime = new Date();
        Date tokenValidity = new Date(tokenCreateTime.getTime() + TimeUnit.MINUTES.toMillis(accessTokenValidity));
        return Jwts.builder()
                .setClaims(claims)
                .setExpiration(tokenValidity)
                .signWith(SignatureAlgorithm.HS256, secret_key)
                .compact();
    }
    private Claims parseJwtClaims(String token) {
        return jwtParser.parseClaimsJws(token).getBody();
    }
    public String isTokenValid(HttpServletRequest request) {
        String bearerToken = request.getHeader(TOKEN_HEADER);
        if (bearerToken != null && bearerToken.startsWith(TOKEN_PREFIX)) {
            return bearerToken.substring(TOKEN_PREFIX.length());
        }
        return null;
    }
    public Claims resolveClaims(HttpServletRequest req) {
        try {
            String token = isTokenValid(req);
            if (token != null) {
                return parseJwtClaims(token);
            }
            return null;
        } catch (ExpiredJwtException ex) {
            req.setAttribute("expired", ex.getMessage());
            throw ex;
        } catch (Exception ex) {
            req.setAttribute("invalid", ex.getMessage());
            throw ex;
        }
    }
    public boolean isTokenExpired(String token) {
        return parseJwtClaims(token).getExpiration().before(new Date());
    }
    public boolean validateClaims(Claims claims) {
        return claims.getExpiration().after(new Date());
    }
    public String getEmail(Claims claims) {
        return claims.getSubject();
    }

    public List<String> getRoles(Claims claims) {
        return  (ArrayList<String>) claims.get("role");
    }
}
