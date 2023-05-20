package com.company.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

//@Component

@Configuration
@Data
public class AppConfigData {
    @Value("${username}")
    private String userName;
    @Value("${password}")

    private String password;
    @Value("${url}")
    private String url;

}
