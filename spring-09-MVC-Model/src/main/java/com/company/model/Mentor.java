package com.company.model;

import com.company.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Mentor {
    private String fistName;
    private String lastName;
    private int age;
    private Gender gender;

}
