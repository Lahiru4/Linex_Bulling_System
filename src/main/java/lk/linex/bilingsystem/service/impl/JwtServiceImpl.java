package lk.linex.bilingsystem.service.impl;

import lk.linex.bilingsystem.config.JwtUtil;
import lk.linex.bilingsystem.dto.UserDTO;
import lk.linex.bilingsystem.service.JwtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JwtServiceImpl implements JwtService {
    @Autowired
    private JwtUtil jwtUtil;

    @Override
    public String createToken(UserDTO userDTO) {
        String token = jwtUtil.createToken(userDTO);
        return null;
    }

    @Override
    public boolean isTokenExpired(String token) {
        return false;
    }

}
