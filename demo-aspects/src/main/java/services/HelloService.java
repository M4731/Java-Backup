package services;


import org.springframework.stereotype.Service;

@Service
public class HelloService {

    public void hello(String name){
        System.out.println("Hello, " + name + "!");
        //throw new RuntimeException("Boo");
    }

    public String hello2(String name){
        return("Hello, " + name + "!");
    }
}
