package com.VTR.ecomerce.ecomerce.repositories;

import com.VTR.ecomerce.ecomerce.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
