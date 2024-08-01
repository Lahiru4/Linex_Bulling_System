package lk.linex.bilingsystem.service;

import lk.linex.bilingsystem.dto.ItemDTO;

public interface StockService {
    String saveItem(ItemDTO itemDTO);

    String updateItem(ItemDTO itemDTO);

    String deleteItem(String code);

    ItemDTO searchItem(String code);
}
