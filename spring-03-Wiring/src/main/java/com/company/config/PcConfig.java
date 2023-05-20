package com.company.config;

import com.company.casefactory.Case;
import com.company.casefactory.DellCase;
import com.company.casefactory.Dimensions;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PcConfig {
    @Bean
    public Dimensions dimensions() {
        return new Dimensions(50, 12, 21);
    }

    @Bean
    public Case caseDell(Dimensions dimensions) {

        return new DellCase("dellModel", "Dell", "240", dimensions);
    }


}
