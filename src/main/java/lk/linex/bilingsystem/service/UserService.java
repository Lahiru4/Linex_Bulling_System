package lk.linex.bilingsystem.service;

import lk.linex.bilingsystem.dto.UserDTO;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService {
    UserDetailsService userDetailsService();
    void save(UserDTO user);



}
