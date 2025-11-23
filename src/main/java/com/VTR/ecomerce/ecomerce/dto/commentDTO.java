package com.VTR.ecomerce.ecomerce.dto;

import lombok.Data;

@Data
public class commentDTO {
    private Long id;
    private String content;
    private Integer score;
    private long usuario;
}
