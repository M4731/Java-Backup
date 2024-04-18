package com.example.SpringDemoAnnotations;

import org.springframework.stereotype.Component;

@Component("antrenorSmecher")
public class PracticeCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "Practice coach";
    }
}
