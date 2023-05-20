package com.company.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/home")
    public String getHomePage() { // which end point www.amazon.com/register
        return "home.html";
    }
    @RequestMapping("/user")
    public String getUserPage() { // which end point www.amazon.com/register
        return "user.html";
    }
    @RequestMapping({"/apple","/orange"})
    public String getAppleOrangePage() { // which end point www.amazon.com/register
        return "AppleOrange.html";
    }


}
