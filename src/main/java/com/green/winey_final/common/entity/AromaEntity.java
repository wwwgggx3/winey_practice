package com.green.winey_final.common.entity;

import com.green.winey_final.common.config.jpa.BaseEntity;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Entity
@Table(name = "t_aroma")
@Data
@SuperBuilder
@NoArgsConstructor
@ToString(callSuper = true)
//@EqualsAndHashCode(callSuper = true)
public class AromaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false, nullable = false, columnDefinition = "BIGINT UNSIGNED")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "productId", updatable = false, nullable = false)
    private ProductEntity productEntity;

    @ManyToOne
    @JoinColumn(name = "aromaCategoryId", updatable = false, nullable = false)
    private AromaCategoryEntity aromaCategoryEntity;


}
