package com.company.entity;


import jakarta.persistence.*;

import java.math.BigDecimal;

@MappedSuperclass
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String owner;
    private BigDecimal balance;
    //interest rate
    private BigDecimal interestRate;

}
