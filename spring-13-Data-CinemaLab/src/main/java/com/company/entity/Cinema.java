package com.company.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Data
public class Cinema extends BaseEntity{

    private String name;
    private String sponsoredName;

    @ManyToOne
    private Location location;

}
