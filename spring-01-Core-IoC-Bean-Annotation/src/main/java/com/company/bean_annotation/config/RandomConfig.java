package com.company.bean_annotation.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RandomConfig {


    @Bean
    public String createString(){
        return "String object";
    }
    @Bean
    public Integer cretateInteger(){
        return 77;

    }

}
