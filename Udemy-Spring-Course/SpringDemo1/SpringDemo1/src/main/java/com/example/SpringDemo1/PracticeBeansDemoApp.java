package com.example.SpringDemo1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PracticeBeansDemoApp {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanPractice-applicationContext.xml");

        Coach coach = context.getBean("myCoach", Coach.class);

        System.out.println(coach.getDailyWorkout());
        System.out.println(coach.getDailyFortune());

        context.close();
    }

}
