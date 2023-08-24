package com.green.winey_final.common.entity;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserID implements Serializable {
    //    @ManyToOne
    //    @JoinColumn(name = "productId", updatable = false, nullable = false)
    //    private ProductEntity productEntity;
    private Long userId;
    private Long ip;
}
