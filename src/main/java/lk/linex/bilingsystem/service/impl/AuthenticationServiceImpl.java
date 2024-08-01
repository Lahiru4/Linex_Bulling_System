package lk.linex.bilingsystem.service.impl;

import lk.linex.bilingsystem.dto.UserDTO;
import lk.linex.bilingsystem.entity.UserEntity;
import lk.linex.bilingsystem.repo.UserRepo;
import lk.linex.bilingsystem.reqAndresp.response.JwtAuthResponse;
import lk.linex.bilingsystem.reqAndresp.secure.SignIn;
import lk.linex.bilingsystem.service.AuthenticationService;
import lk.linex.bilingsystem.util.RespList;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class AuthenticationServiceImpl implements AuthenticationService {

    private final UserRepo userRepo;

    private final PasswordEncoder passwordEncoder;

    @Override
    public JwtAuthResponse signIn(SignIn signIn) {
        return null;
    }

    @Override
    public JwtAuthResponse signUp(UserDTO userDTO) {
        boolean existsByEmail = userRepo.existsByEmail(userDTO.getEmail());
        if (existsByEmail) {
            return new JwtAuthResponse(RespList.EMAIL_ALREADY_EXISTS, null, null, null);
        }
        UserEntity build = UserEntity.builder()
                .email(userDTO.getEmail())
                .password(passwordEncoder.encode(userDTO.getPassword()))
                .build();
        UserEntity save = userRepo.save(build);
        System.out.println(save);
        return null;
    }

    @Override
    public JwtAuthResponse refreshToken(String accessToken) {
        return null;
    }
}
