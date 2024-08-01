package lk.linex.bilingsystem.repo;

import lk.linex.bilingsystem.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepo extends JpaRepository<UserEntity,Integer> {
    boolean existsByEmail(String email);
}
