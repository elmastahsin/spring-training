package com.company.controller;

import com.company.enums.Gender;
import com.company.model.Mentor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MentorController {

    @RequestMapping("/list")
    public String getMentorList(Model model){
        List<Mentor> mentorList= new ArrayList<>();
        mentorList.add(new Mentor("Mike","Johnson",23, Gender.MALE));
        mentorList.add(new Mentor("John","Smith",43, Gender.MALE));
        mentorList.add(new Mentor("Emily","Stone",33, Gender.FEMALE));
        mentorList.add(new Mentor("Jessica","Parker",53, Gender.FEMALE));

        model.addAttribute("mentors",mentorList);
        return "mentor/list";
    }
}
