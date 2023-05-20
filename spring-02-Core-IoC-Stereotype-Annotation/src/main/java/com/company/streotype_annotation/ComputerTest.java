package com.company.streotype_annotation;

import com.company.streotype_annotation.config.PcConfig;
import com.company.streotype_annotation.monitorfactory.Monitor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ComputerTest {
    public static void main(String[] args) {

        ApplicationContext container = new AnnotationConfigApplicationContext(PcConfig.class);


        Monitor theMonitor = container.getBean(Monitor.class);

        System.out.println(theMonitor.getSize());
    }
}
