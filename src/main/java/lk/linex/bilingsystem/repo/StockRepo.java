package lk.linex.bilingsystem.repo;

import lk.linex.bilingsystem.entity.ItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockRepo extends JpaRepository<ItemEntity, Integer> {
}
