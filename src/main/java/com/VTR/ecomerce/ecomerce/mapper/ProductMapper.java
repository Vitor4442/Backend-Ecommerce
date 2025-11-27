package com.VTR.ecomerce.ecomerce.mapper;

import com.VTR.ecomerce.ecomerce.dto.CommentDTO;
import com.VTR.ecomerce.ecomerce.dto.ProductDTO;
import com.VTR.ecomerce.ecomerce.model.Comment;
import com.VTR.ecomerce.ecomerce.model.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ProductMapper {

    @Mapping(target = "image", source = "image")
    ProductDTO toDTO (Product product);

    @Mapping(target = "image", source = "image")
    Product toEntity (ProductDTO productDTO);

    CommentDTO toDTO (Comment comment);
    Comment toEntity (CommentDTO commentDTO);
}
