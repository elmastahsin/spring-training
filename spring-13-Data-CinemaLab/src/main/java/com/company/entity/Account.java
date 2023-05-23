package com.company.entity;

import com.company.enums.UserRole;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "account_details")
@Data
@NoArgsConstructor
public class Account extends BaseEntity {

    private String name;
    private String address;
    private String country;
    private String state;
    private String city;
    private String postalCode;
    private Integer age;

    @Enumerated(EnumType.STRING)
    private UserRole userRole;
    @OneToOne(mappedBy = "account")
    private User user;
}
