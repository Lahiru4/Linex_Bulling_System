package lk.linex.bilingsystem.service;

import lk.linex.bilingsystem.dto.UserDTO;
import lk.linex.bilingsystem.reqAndresp.response.JwtAuthResponse;
import lk.linex.bilingsystem.reqAndresp.secure.SignIn;
import lk.linex.bilingsystem.reqAndresp.secure.SignUp;

public interface AuthenticationService {
    JwtAuthResponse signIn(SignIn signIn);
    JwtAuthResponse signUp(UserDTO userDTO);
    JwtAuthResponse refreshToken(String accessToken);
}
