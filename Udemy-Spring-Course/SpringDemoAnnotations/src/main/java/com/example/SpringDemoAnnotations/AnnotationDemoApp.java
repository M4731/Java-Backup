package com.example.SpringDemoAnnotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

    public static void main(String[] args) {

        //read spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //get the bean from the spring container
        Coach coach = context.getBean("tennisCoach",Coach.class);
        Coach practiceCoach = context.getBean("antrenorSmecher", Coach.class);

        //call a method on the bean
        System.out.println(coach.getDailyWorkout());
        System.out.println(practiceCoach.getDailyWorkout());

        System.out.println(coach.getDailyFortune());

        System.out.println(practiceCoach.getDailyFortune());

        //close the container
        context.close();

    }

}
