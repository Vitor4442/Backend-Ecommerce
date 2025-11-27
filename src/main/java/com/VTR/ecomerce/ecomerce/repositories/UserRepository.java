package com.VTR.ecomerce.ecomerce.repositories;

import com.VTR.ecomerce.ecomerce.model.Comment;
import com.VTR.ecomerce.ecomerce.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail (String email);
}
