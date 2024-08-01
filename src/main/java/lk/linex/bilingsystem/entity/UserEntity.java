package lk.linex.bilingsystem.entity;


import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity
public class UserEntity {
    @Id
    private int id;

    private String userName;

    private String address;


    private String contact;


    private String email;

    private String password;

    private String role;

    private String status;

    private String imagePath;

    private String shopId;
}
