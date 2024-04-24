package com.example.SpringDemoAnnotations;

public class SecondPracticeCoach implements Coach{

    private FortuneService fortuneService;

    public SecondPracticeCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Second Practice Coach";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
