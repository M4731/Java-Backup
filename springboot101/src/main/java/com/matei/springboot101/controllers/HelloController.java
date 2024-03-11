package com.matei.springboot101.controllers;

import com.matei.springboot101.dto.Person;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


//@Controller
@RestController //combinatie intre controller si ResponseBody
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "Hello";
    }

    // @ResponseBody  // nu cauta html in fisierul de resurse static
    @GetMapping(path = "/hello/{name}") // GET POST
    public String hello(@PathVariable("name") String name){
        return "Hello " + name + "!";
    }

    @PostMapping(path = "/goodbye")
    public String goodbye(@RequestBody Person p){
        return "Goodbye " + p.getName() + "!";
    }

    @GetMapping(path = "/get")
    public Person getPerson(){
        Person p = new Person();
        p.setName("Matei");
        return p;
    }

    @GetMapping(path = "/getAll")
    public List<Person> getAllPersons(){
        Person p = new Person();
        p.setName("Matei");
        Person p1 = new Person();
        p1.setName("Dragos");
        Person p2 = new Person();
        p2.setName("Marian");
        List l = new ArrayList<Person>();
        l.add(p);
        l.add(p1);
        l.add(p2);
        return l;
    }

    @GetMapping(path = "/statustest")
    public void statusTest(HttpServletResponse response){
        response.setStatus(HttpServletResponse.SC_NO_CONTENT);
    }


    //GET NU TE LASA SA FOLOSESTI REQUEST BODY
    @PostMapping(path = "/test/{name}")
    public String test(@PathVariable String name,
                       @RequestHeader String a,
                       @RequestHeader String b,
                       @RequestHeader String c,
                       @RequestBody String body){
        return name + " " + a + " " + b + " " + c + " " + body;
    }

}
