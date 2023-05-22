package com.company.entity;


import jakarta.persistence.Entity;

import java.math.BigDecimal;

@Entity
public class Account {

    private Long id;
    private String owner;
    private BigDecimal balance;
    //interest rate
    private BigDecimal interestRate;

}
