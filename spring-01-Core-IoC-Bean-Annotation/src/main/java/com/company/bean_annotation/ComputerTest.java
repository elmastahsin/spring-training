package com.company.bean_annotation;

import com.company.bean_annotation.casefactory.Case;
import com.company.bean_annotation.casefactory.DellCase;
import com.company.bean_annotation.config.ComputerConfig;
import com.company.bean_annotation.config.RandomConfig;
import com.company.bean_annotation.monitorfactory.Monitor;
import com.company.bean_annotation.monitorfactory.SonyMonitor;
import com.company.bean_annotation.motherboardfactory.AsusMotherboard;
import com.company.bean_annotation.motherboardfactory.Motherboard;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ComputerTest {
    public static void main(String[] args) {


        System.out.println("Creating container");
        // Creating Container by using Application Context
        AnnotationConfigApplicationContext container = new AnnotationConfigApplicationContext(ComputerConfig.class, RandomConfig.class);


        // Creating container by using BeanFactory
        BeanFactory context = new AnnotationConfigApplicationContext();

        System.out.println("***********Retrieving the beans***********");

        SonyMonitor sony = container.getBean(SonyMonitor.class);
        DellCase dell = container.getBean(DellCase.class);
        AsusMotherboard asus = container.getBean(AsusMotherboard.class);


        PC myPc = new PC(dell, sony, asus);


        myPc.powerUp();

        dell.pressPowerButton();

        System.out.println("***********Retrieving the beans***********");

//
//        Monitor theMonitor = container.getBean(Monitor.class);
//        Case theCase = container.getBean(Case.class);
//        Motherboard theMotherBoard = container.getBean(Motherboard.class);
//        PC myPc2 = new PC(theCase,theMonitor, theMotherBoard);
//
//
//        myPc2.powerUp();
        System.out.println("***********Multiple Objects***********");
        Monitor theMonitor2 = container.getBean("sony", Monitor.class); // Default bean Name
        Monitor theMonitor3 = container.getBean(SonyMonitor.class); // Custom bean Name
        Monitor theMonitor4 = container.getBean( Monitor.class); // Primaryc bean Name


        Case theCase = container.getBean(Case.class);
        Motherboard theMotherBoard = container.getBean(Motherboard.class);
        PC myPc2 = new PC(theCase, theMonitor2, theMotherBoard);
        myPc2.powerUp();
    }
}
