package com.company.entity;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "paymentDetails")
@NoArgsConstructor
@Data
public class PaymentDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private BigDecimal merchantPayoutAmount;
    private BigDecimal comissionAmount;

    @Column(columnDefinition = "DATE")
    private LocalDate payoutDate;

    public PaymentDetail(BigDecimal merchantPayoutAmount, BigDecimal comissionAmount, LocalDate payoutDate) {
        this.merchantPayoutAmount = merchantPayoutAmount;
        this.comissionAmount = comissionAmount;
        this.payoutDate = payoutDate;
    }
}
