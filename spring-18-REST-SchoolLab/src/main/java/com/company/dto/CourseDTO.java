package com.company.dto;

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

public class CourseDTO {

    @JsonIgnore
    private Long id;

    private String courseName;
    private String description;

}