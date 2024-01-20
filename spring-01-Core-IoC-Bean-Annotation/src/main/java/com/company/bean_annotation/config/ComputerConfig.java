package com.company.bean_annotation.config;

import com.company.bean_annotation.casefactory.Case;
import com.company.bean_annotation.casefactory.DellCase;
import com.company.bean_annotation.monitorfactory.AcerMonitor;
import com.company.bean_annotation.monitorfactory.Monitor;
import com.company.bean_annotation.monitorfactory.SonyMonitor;
import com.company.bean_annotation.motherboardfactory.AsusMotherboard;
import com.company.bean_annotation.motherboardfactory.Motherboard;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ComputerConfig {

    @Bean(name = "sony")
    public Monitor monitorSony() {

        return new SonyMonitor("25 inch Beast", "Acer", 25); //Monitor abc = new SonyMonitor;
    }
//    @Bean(name = "sony2")
//    public Monitor monitorSony2() {
//
//        return new SonyMonitor("40 inch Beast", "Acer", 25); //Monitor abc = new SonyMonitor;
//    }
    @Bean(name = "acer")
    @Primary
    public Monitor monitorAcer() {

        return new AcerMonitor("25 inch Beast", "Acer", 25); //Monitor abc = new SonyMonitor;
    }

    @Bean
    public Case caseDell() {
        return new DellCase("XF23", "Dell", "240");
    }

    @Bean
    public Motherboard motherboardAsus() {
        return new AsusMotherboard("BJ-200", "Asus", 4, 6, "v2");
    }

}
