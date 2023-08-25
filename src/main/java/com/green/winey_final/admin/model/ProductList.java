package com.green.winey_final.admin.model;

import java.util.List;

import com.green.winey_final.common.entity.ProductEntity;
import lombok.*;

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ProductList {
    private PageDto page;
    private List<ProductEntity> productList;
}
