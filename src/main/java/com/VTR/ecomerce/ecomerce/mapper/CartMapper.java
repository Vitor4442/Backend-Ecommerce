package com.VTR.ecomerce.ecomerce.mapper;

import com.VTR.ecomerce.ecomerce.dto.CartDTO;
import com.VTR.ecomerce.ecomerce.dto.CartItemDTO;
import com.VTR.ecomerce.ecomerce.model.Cart;
import com.VTR.ecomerce.ecomerce.model.CartItem;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CartMapper {
    @Mapping(target = "userId", source = "user.id")
    CartDTO toDTO(Cart Cart);
    @Mapping(target="user.id", source = "userId")
    Cart toEntity(CartDTO cartDTO);

    @Mapping(target="productId", source="product.id")
    CartItemDTO toDTO(CartItem cartItem);

    @Mapping(target="product.id", source="productId")
    CartItem toEntity(CartItemDTO cartItemDTO);
}
