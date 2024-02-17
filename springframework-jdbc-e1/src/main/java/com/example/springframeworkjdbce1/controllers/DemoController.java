package com.example.springframeworkjdbce1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class DemoController {
    @GetMapping("/demo")
    public String demo(){
        return "index.html";
    }

}
