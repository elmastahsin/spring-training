package com.company.bootstrap;

import com.company.model.Student;
import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.List;

public class DataGenerator {

    public static List<Student> createPerson(int size) {
        Faker faker = new Faker();

        List<Student> students = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            Student student = new Student(faker.name().firstName(), faker.name().lastName(), faker.number().numberBetween(18, 40), faker.address().state());
            students.add(student);

        }
        return students;
    }
}
