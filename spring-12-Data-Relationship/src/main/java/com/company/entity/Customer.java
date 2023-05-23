package com.company.entity;

import jakarta.persistence.*;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "customers")
@NoArgsConstructor
@Data
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String name;
    private String surname;
    private String username;
    private String address;
    private String email;


    @OneToMany(mappedBy = "customer",fetch = FetchType.LAZY)
    private List<Payment>  paymentList;

    public Customer(String name, String surname, String username, String email, List<Payment> paymentList) {
        this.name = name;
        this.surname = surname;
        this.username = username;
        this.email = email;

    }

    public Customer(String name, String surname, String username, String address, String email) {
        this.name = name;
        this.surname = surname;
        this.username = username;
        this.address = address;
        this.email = email;
    }
}
