package lk.linex.bilingsystem.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class  UserDTO {
    private String id;
    private String userName;
    private String address;
    private String contact;
    private String email;
    private String password;
    private String role;
    private String status;

}
