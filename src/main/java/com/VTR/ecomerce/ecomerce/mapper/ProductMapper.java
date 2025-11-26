package com.VTR.ecomerce.ecomerce.mapper;

import com.VTR.ecomerce.ecomerce.dto.ProductDTO;
import com.VTR.ecomerce.ecomerce.model.Product;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductMapper {

    ProductDTO toDTO (Product product);
    Product toEntity (ProductDTO productDTO);
}
