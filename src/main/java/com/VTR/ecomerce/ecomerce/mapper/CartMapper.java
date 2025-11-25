package com.VTR.ecomerce.ecomerce.mapper;

import com.VTR.ecomerce.ecomerce.dto.CartDto;
import com.VTR.ecomerce.ecomerce.dto.CartitemDTO;
import com.VTR.ecomerce.ecomerce.model.Cart;
import com.VTR.ecomerce.ecomerce.model.CartItem;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CartMapper {
    @Mapping(target = "UserId", source = "user.id")
    CartDto toDTO(Cart cart);

    @Mapping(target = "UserId", source = "user.id")
    Cart toEntity(CartDto cartDto);

    @Mapping(target = "ProductID", source = "Product.id")
    CartitemDTO toDto (CartItem cartItem);
}
