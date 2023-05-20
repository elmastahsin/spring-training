package com.company.controller;


import com.company.model.Mentor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/mentor")
public class MentorController {
    @GetMapping("/register")//localhost:8080/mentor/register
    public String register(Model model) {
        List<String> groupList = Arrays.asList("ceng111", "ceng140", "ceng213");
        model.addAttribute("groupList", groupList);

        model.addAttribute("mentor", new Mentor());
        return "mentor/register";
    }

    @PostMapping("/confirm")//localhost:8080/mentor/register
    public String submitForm(@ModelAttribute("mentor") Mentor mentor) {



        //how can  access to mentor attribute in this method
//        return "mentor/confirm";

        return "redirect:/mentor/register";
    }

}
