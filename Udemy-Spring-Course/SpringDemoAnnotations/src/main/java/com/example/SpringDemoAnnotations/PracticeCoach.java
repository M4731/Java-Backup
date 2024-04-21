package com.example.SpringDemoAnnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("antrenorSmecher")
public class PracticeCoach implements Coach{

    @Autowired
    @Qualifier("fileFortuneService")
    private FortuneService fortuneService;

    @Override
    public String getDailyWorkout() {
        return "Practice coach";
    }

    @Override
    public String getDailyFortune() {
        return "practice coach fortune : " + fortuneService.getFortune();
    }
}
