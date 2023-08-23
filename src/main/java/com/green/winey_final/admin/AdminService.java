package com.green.winey_final.admin;

import com.green.winey_final.admin.model.ProductInsDto;
import com.green.winey_final.admin.model.ProductInsParam;
import com.green.winey_final.common.entity.FeatureEntity;
import com.green.winey_final.common.repository.AromaRepository;
import com.green.winey_final.common.repository.FeatureRepository;
import com.green.winey_final.common.repository.ProductRepository;
import com.green.winey_final.common.repository.SaleRepository;
import com.green.winey_final.utils.MyFileUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Slf4j
@Service
//@RequiredArgsConstructor
public class AdminService {

    private final AdminMapper MAPPER;
    private final String FILE_DIR;

    private final ProductRepository productRep;
    private final FeatureRepository featureRep;
    private final SaleRepository saleRep;
    private final AromaRepository aromaRep;

    @Autowired
    public AdminService(AdminMapper MAPPER, @Value("${file.dir}") String FILE_DIR, ProductRepository productRep, FeatureRepository featureRep, SaleRepository saleRep, AromaRepository aromaRep) {
        this.MAPPER = MAPPER;
        this.FILE_DIR = MyFileUtils.getAbsolutePath(FILE_DIR);
        this.productRep = productRep;
        this.featureRep = featureRep;
        this.saleRep = saleRep;
        this.aromaRep = aromaRep;
    }

    public int postProduct(MultipartFile pic, ProductInsParam param) {

        //t_feature 인서트

        FeatureEntity featureEntity = new FeatureEntity();
        featureEntity.setAcidity(param.getAcidity());
        featureEntity.setSweety(param.getBody());
        featureEntity.setBody(param.getBody());

        FeatureEntity featureResult = featureRep.save(featureEntity);
        //사진파일 업로드 로직1

        //사진파일 업로드 로직2
        //로직2 안에 t_product 인서트
        //로직2 안에 t_sale 인서트
        //로직2 안에 t_aroma인서트
        //로직2 안에 t_winepairing인서트

        return 1;
    }

}
