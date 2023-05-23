package com.company.entity;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "items")
@NoArgsConstructor
@Data
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String code;


    @ManyToMany(mappedBy = "itemList")
    private List<Cart> cartList;

    public Item(String name, String code) {
        this.name = name;
        this.code = code;
    }
}
