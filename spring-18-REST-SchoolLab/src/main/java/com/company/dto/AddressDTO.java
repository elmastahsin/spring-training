package com.company.dto;

import com.company.enums.AddressType;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true) // to ignore unknown properties
@JsonInclude(JsonInclude.Include.NON_NULL) // to ignore null properties
public class AddressDTO {

    @JsonIgnore // to ignore id field when we want to create a new address
    private Long id;

    private String street;
    private String country;
    private String state;
    private String city;
    private String postalCode;
    private AddressType addressType;
    @JsonBackReference(value = "student-address-reference")
    private StudentDTO student;

    @JsonBackReference(value = "parent-address-reference")
    private ParentDTO parent;

    @JsonBackReference(value = "teacher-address-reference")
    private TeacherDTO teacher;

    private Integer currentTemperature;     // Weather information, which we will later get it from 3rd party API

}