package com.example.SpringDemo1;

public class TennisCoach implements Coach{

    private FortuneService fortuneService;

    public TennisCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Exercise the serve 20 times";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }


}
