package com.company.model;

import lombok.*;
import org.springframework.stereotype.Component;

@Data
public class Comment {
    private String author;
    private String comment;

}
