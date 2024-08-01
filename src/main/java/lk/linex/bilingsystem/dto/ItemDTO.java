package lk.linex.bilingsystem.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ItemDTO {
    private int id;
    private String name;
    private String qty;
    private String byPrice;
    private String unitByPrice;
    private String unitSellPrice;
    private String profit;
}
