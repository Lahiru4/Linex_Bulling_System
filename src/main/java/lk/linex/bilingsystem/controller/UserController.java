package lk.linex.bilingsystem.controller;

import lk.linex.bilingsystem.dto.ResponseDTO;


import lk.linex.bilingsystem.dto.UserDTO;
import lk.linex.bilingsystem.reqAndresp.response.JwtAuthResponse;
import lk.linex.bilingsystem.reqAndresp.secure.SignIn;
import lk.linex.bilingsystem.service.AuthenticationService;
import lk.linex.bilingsystem.service.UserService;
import lk.linex.bilingsystem.util.RespList;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/user")
@CrossOrigin
@RequiredArgsConstructor
public class UserController {

    private final ResponseDTO responseDTO;

    private final UserService userService;
    private final AuthenticationService authenticationService;

    @PostMapping("/signIn")
    public ResponseEntity<?> signIn(@RequestBody SignIn signIn) {
        return null;
    }
    @PostMapping("/signUp")
    public ResponseEntity<?> signUp(@RequestBody UserDTO userDTO) {
        JwtAuthResponse jwtAuthResponse = authenticationService.signUp(userDTO);
        responseDTO.setContent(jwtAuthResponse);

        return null;
    }


}
