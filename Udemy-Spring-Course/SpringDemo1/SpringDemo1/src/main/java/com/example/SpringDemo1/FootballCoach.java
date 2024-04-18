package com.example.SpringDemo1;

public class FootballCoach implements Coach {

    private FortuneService fortuneService;

    public FootballCoach(){}

    public FootballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Run 5km";
    }

    @Override
    public String getDailyFortune() {
        return "Just do it : " + fortuneService.getFortune();
    }
}
