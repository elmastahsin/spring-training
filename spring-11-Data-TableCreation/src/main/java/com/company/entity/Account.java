package com.company.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.math.BigDecimal;

@Entity
public class Account {

    @Id
    private Long id;
    private String owner;
    private BigDecimal balance;
    //interest rate
    private BigDecimal interestRate;

}
