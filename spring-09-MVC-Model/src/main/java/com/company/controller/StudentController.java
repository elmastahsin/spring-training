package com.company.controller;

import com.company.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Controller
public class StudentController {


    @RequestMapping("/welcome")
    public String homePage(Model model) {
        model.addAttribute("schoolName", "METU");
        model.addAttribute("course", "Spring");
        model.addAttribute("name", "METU");
        String subject = "Spring Boot";
        model.addAttribute("subject", subject);

        int studentId = new Random().nextInt();
        model.addAttribute("studentId", studentId);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);

        model.addAttribute("numbers", numbers);


        LocalDateTime dt= LocalDateTime.now();
        model.addAttribute("dateTime",dt);

        Student student= new Student(1,"Mike","Smith");
        model.addAttribute("student",student);


        return "/student/welcome";

    }
}
