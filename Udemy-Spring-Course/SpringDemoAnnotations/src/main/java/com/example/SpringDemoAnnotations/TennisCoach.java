package com.example.SpringDemoAnnotations;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class TennisCoach implements Coach{

    @Autowired
    @Qualifier("randomFortuneService")
    private FortuneService fortuneService;

//    @Autowired
//    public TennisCoach(FortuneService fortuneService){
//        this.fortuneService = fortuneService;
//    }


    public TennisCoach() {
        System.out.println(">>TennisCoach : inside default constructor");
    }

//    @Autowired
//    public void setFortuneService(FortuneService fortuneService) {
//        System.out.println(">>TennisCoach : inside setFortuneService() method");
//        this.fortuneService = fortuneService;
//    }

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    //define init method
    @PostConstruct
    public void startupStuff(){
        System.out.println(">>TennisCoach : inside startupStuff");
    }


    //define destroy method
    @PreDestroy
    public void cleanupStuff(){
        System.out.println(">>TennisCoach : inside cleanupStuff");
    }
}
