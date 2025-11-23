package com.VTR.ecomerce.ecomerce.dto;

import com.VTR.ecomerce.ecomerce.model.Order;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class ordemDTO {
    private Long id;
    private Long userId;
    private String address;
    private String phonenumber;
    private Order.OrderStatus status;
    private LocalDateTime createdAT;
    private List<OrderitemDTO> orderitems;
}
