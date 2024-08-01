package lk.linex.bilingsystem.service.impl;

import lk.linex.bilingsystem.dto.UserDTO;
import lk.linex.bilingsystem.service.UserService;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public UserDetailsService userDetailsService() {
        return null;
    }

    @Override
    public void save(UserDTO user) {

    }
}
