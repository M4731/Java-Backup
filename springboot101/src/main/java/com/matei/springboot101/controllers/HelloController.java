package com.matei.springboot101.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


//@Controller
@RestController //combinatie intre controller si restbody
public class HelloController {

    // @ResponseBody  // nu cauta html in fisierul de resurse static
    @RequestMapping("/hello") // GET POST
    public String hello(){
        return "Hello";
    }

}
