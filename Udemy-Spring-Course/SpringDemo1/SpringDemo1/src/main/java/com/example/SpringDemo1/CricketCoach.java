package com.example.SpringDemo1;

public class CricketCoach implements Coach{

    private FortuneService fortuneService;
    private String emailAddress;
    private String team;

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
        System.out.println("Cricket coach : inside setter method - setEmailAddress");
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
        System.out.println("Cricket coach : inside setter method - setTeam");
    }

    public CricketCoach() {
        System.out.println("Cricket coach : inside no-args constructor");
    }

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("Cricket coach : inside setter method - setFortuneService");
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
