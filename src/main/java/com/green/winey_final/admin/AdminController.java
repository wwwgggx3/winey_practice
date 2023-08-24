package com.green.winey_final.admin;

import com.green.winey_final.admin.model.ProductInsParam;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
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
}
