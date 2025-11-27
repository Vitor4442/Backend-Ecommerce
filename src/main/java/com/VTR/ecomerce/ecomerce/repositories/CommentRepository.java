package com.VTR.ecomerce.ecomerce.repositories;

import com.VTR.ecomerce.ecomerce.model.Cart;
import com.VTR.ecomerce.ecomerce.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface CommentRepository extends JpaRepository<Cart, Long> {
    List<Comment> FindByProductId(Long productId);
}
