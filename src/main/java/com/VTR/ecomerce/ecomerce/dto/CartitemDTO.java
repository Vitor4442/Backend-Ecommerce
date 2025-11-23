package com.VTR.ecomerce.ecomerce.dto;

import lombok.Data;

@Data
public class CartitemDTO {
    private Long id;
    private Integer quantity;
    private long productId;
}
