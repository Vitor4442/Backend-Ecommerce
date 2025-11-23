package com.VTR.ecomerce.ecomerce.dto;

import lombok.Data;
import java.util.List;

@Data
public class CartDto {
    private long id;
    private long userid;
    private List<CartitemDTO> items;
}
