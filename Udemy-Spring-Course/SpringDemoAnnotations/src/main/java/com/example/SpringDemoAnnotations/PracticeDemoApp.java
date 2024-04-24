package com.example.SpringDemoAnnotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PracticeDemoApp {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =  new AnnotationConfigApplicationContext(PracticeConfig.class);

        Coach coach = context.getBean("secondPracticeCoach", Coach.class);

        System.out.println(coach.getDailyFortune());
        System.out.println(coach.getDailyWorkout());

        context.close();
    }

}
