package com.VTR.ecomerce.ecomerce.mapper;

import com.VTR.ecomerce.ecomerce.dto.ordemDTO;
import com.VTR.ecomerce.ecomerce.model.Order;
import org.aspectj.weaver.ast.Or;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface OrderMapper {
    @Mapping(target = "userId", source = "user.id")
    @Mapping(target = "orderitems", source = "items")
    ordemDTO toDTO (Order order);

    @Mapping(target = "user.id", source = "userId")
    @Mapping(target = "items", source = "orderitems")
    Order toEntity (ordemDTO orderdto);

    List<ordemDTO> toDTO (List<Order> orders);
    List<Order> toEntity (List<ordemDTO> ordemDTOSs);
}
