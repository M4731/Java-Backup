package com.example.SpringDemo1;

import org.springframework.beans.factory.DisposableBean;

public class PracticeCoach implements Coach, DisposableBean {

    private FortuneService fortuneService;

    public PracticeCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice coach workout";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    public void doMyStartupStuff(){
        System.out.println("PracticeCoach : inside method doMyStartupStuff");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("PracticeCoach : inside method destroy");
    }
}
