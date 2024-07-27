package me.dio.repository;

import me.dio.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    //no jpa passa a classe e o id; no spring jpa tem todas as manipulações crud

    boolean existsByAccountNumber(String accountNumber);
}
