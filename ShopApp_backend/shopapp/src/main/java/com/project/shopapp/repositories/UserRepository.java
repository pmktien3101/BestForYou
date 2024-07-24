package com.project.shopapp.repositories;

import com.project.shopapp.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long> {

        boolean existsByPhoneNumber(String phoneNumber);// check user có phone này có tồn tại ko
        Optional<User> findByPhoneNumber(String phoneNumber);
        // select * from users where phoneNumber =?
}
