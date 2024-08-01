package lk.linex.bilingsystem.service.impl;

import lk.linex.bilingsystem.dto.ItemDTO;
import lk.linex.bilingsystem.entity.ItemEntity;
import lk.linex.bilingsystem.repo.StockRepo;
import lk.linex.bilingsystem.service.StockService;
import lk.linex.bilingsystem.util.RespList;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StockServiceImpl implements StockService {
    private final StockRepo stockRepo;
    private final ModelMapper modelMapper;

    @Override
    public String saveItem(ItemDTO itemDTO) {
        ItemEntity save = stockRepo.save(modelMapper.map(itemDTO, ItemEntity.class));
        if (save != null) {
            return RespList.RSP_SUCCESS;
        }
        return RespList.RSP_ERROR;
    }

    @Override
    public String updateItem(ItemDTO itemDTO) {
        return null;
    }

    @Override
    public String deleteItem(String code) {
        return null;
    }

    @Override
    public ItemDTO searchItem(String code) {
        return null;
    }
}
