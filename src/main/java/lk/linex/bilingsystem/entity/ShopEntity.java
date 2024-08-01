package lk.linex.bilingsystem.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class ShopEntity {
    @Id
    private int id;
    private String shopName;
    private String shopAddress;
    private String shopContact;
    private String shopEmail;
    private String imagePath;

}
