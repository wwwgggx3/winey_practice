package com.green.winey_final.common.entity;

import com.green.winey_final.common.config.jpa.BaseEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;

@Entity
@Table(name = "t_order_refund")
@Data
@SuperBuilder
@NoArgsConstructor
@ToString(callSuper = true)
public class OrderRefundEntity extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false, nullable = false, columnDefinition = "BIGINT UNSIGNED")
    private Long refundId;

    @ManyToOne
    @JoinColumn(name = "orderId", updatable = false, nullable = false)
    private OrderEntity orderEntity;

    @Column(nullable = false, length = 50)
    @Size(min = 10, max = 50)
    private String refundReason;

    @Column(length = 11)
    private Long refundYn;

    private LocalDateTime refundDate; //이거 확인 필요
}
