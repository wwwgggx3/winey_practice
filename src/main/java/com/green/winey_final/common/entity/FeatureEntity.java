package com.green.winey_final.common.entity;

import com.green.winey_final.common.config.jpa.BaseEntity;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.DynamicInsert;

@Entity
@Table(name = "t_feature")
@Data
@SuperBuilder
@NoArgsConstructor
@ToString(callSuper = true)
@DynamicInsert
public class FeatureEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false, nullable = false, columnDefinition = "BIGINT UNSIGNED")
    private Long featureId;

    @Column(length = 3)
    private Long sweety;

    @Column(length = 3)
    private Long acidity;

    @Column(length = 3)
    private Long body;
}
