package com.green.winey_final.common.entity;

import com.green.winey_final.common.config.jpa.BaseEntity;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.DynamicInsert;

@Entity
@Table(name = "t_country")
@Data
@SuperBuilder
@NoArgsConstructor
@ToString(callSuper = true)
@DynamicInsert
public class CountryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false, nullable = false, columnDefinition = "BIGINT UNSIGNED")
    private Long countryId;

    @Column(nullable = false, length = 30)
    private String nm;
}
