package com.green.winey_final.admin.model;

import lombok.*;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductVo {
    private Long productId;
    private String nmKor;
    private int price;
    private int promotion;
    private int beginner;
    private int quantity;
}

