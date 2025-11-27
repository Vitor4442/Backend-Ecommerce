package com.VTR.ecomerce.ecomerce.repositories;

import com.VTR.ecomerce.ecomerce.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long> {

    List<Order> findByUserID(Long userId);

}
