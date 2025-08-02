package com.shiv.simpleWebApp.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController//handles the req//we can also use Restctrlr  & return json data only.
public class HomeController {


    @RequestMapping("/")//this maps to the / requ.
    //@ResponseBody -returns only the data not the pages.
    public String greet(){
        return "Hello world " + "welcome to my world";
    }

    @RequestMapping("/about")/// about url maps to the about method.
    public String about(){
        return "We dont teach we educate";

    }
}
