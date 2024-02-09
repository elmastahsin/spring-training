package com.company.spring26jwt.request;

import lombok.Data;

@Data
public class LoginRequest {

    private String username;
    private String password;

}
