package lk.linex.bilingsystem.service;

import lk.linex.bilingsystem.dto.UserDTO;

public interface JwtService {
    String createToken(UserDTO userDTO);
    boolean isTokenExpired(String token);
}
