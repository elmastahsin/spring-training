package com.company.bootstrap;


import com.company.entity.Car;
import org.springframework.boot.CommandLineRunner;

public class DataGenerator implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        Car car1 = new Car("BMW", "M5");
        Car car2 = new Car("Audi", "A8");
        Car car3 = new Car("Mercedes", "S500");
        Car car4 = new Car("Opel", "Astra");
        Car car5 = new Car("Volkswagen", "Passat");
        Car car6 = new Car("Ferrari", "F50");
    }


}
