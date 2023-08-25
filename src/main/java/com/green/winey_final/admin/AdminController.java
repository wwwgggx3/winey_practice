package com.green.winey_final.admin;

import com.green.winey_final.admin.model.ProductInsParam;
import com.green.winey_final.admin.model.ProductList;
import com.green.winey_final.admin.model.ProductUpdParam;
import com.green.winey_final.admin.model.SelListDto;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@Tag(name = "관리자 페이지")
@RestController
@RequestMapping("/api/admin")
public class AdminController {

    private final AdminService SERVICE;

    @Autowired
    public AdminController(AdminService SERVICE) {
        this.SERVICE = SERVICE;
    }

    @PostMapping(consumes = {MediaType.MULTIPART_FORM_DATA_VALUE})
    public Long postProduct(@RequestPart(required = false) MultipartFile pic, @RequestPart ProductInsParam param) {
        return SERVICE.postProduct(pic, param);
    }

    @PutMapping(consumes = {MediaType.MULTIPART_FORM_DATA_VALUE})
    public Long putProduct(@RequestPart(required = false) MultipartFile pic, @RequestPart ProductUpdParam param) {
        return SERVICE.putProduct(pic, param);
    }


    @GetMapping("/product/list")
    public ProductList getProduct( @PageableDefault(sort = "product_id", direction = Sort.Direction.DESC, size = 10)
                                   Pageable pageable) {

        return SERVICE.getProduct(pageable);
    }

}
