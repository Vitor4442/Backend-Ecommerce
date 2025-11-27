package com.VTR.ecomerce.ecomerce.repositories;

import com.VTR.ecomerce.ecomerce.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CartRepository extends JpaRepository<Cart, Long> {
    Optional<Cart> findByUserId(Long userId);
}
