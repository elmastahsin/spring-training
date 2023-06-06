package com.company.entity;

import com.company.enums.UserRole;
import javax.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
@Data // Getter Setter ToString
@NoArgsConstructor
@Table(name = "account_details")
public class Account extends BaseEntity {

    private String name;
    private String address;
    private String country;
    private String state;
    private String city;
    private Integer age;
    private String postalCode;
    @Enumerated(EnumType.STRING)
    private UserRole role;
    @OneToOne(mappedBy = "account")
    private User user;



}
