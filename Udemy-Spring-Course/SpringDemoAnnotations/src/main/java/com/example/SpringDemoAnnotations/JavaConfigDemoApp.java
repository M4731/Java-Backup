package com.example.SpringDemoAnnotations;

import com.example.SpringDemoAnnotations.Coach;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigDemoApp {

    public static void main(String[] args) {

        //read spring config java class
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

        //get the bean from the spring container
        Coach coach = context.getBean("tennisCoach",Coach.class);
        Coach practiceCoach = context.getBean("antrenorSmecher", Coach.class);

        //call a method on the bean
        //System.out.println(coach.getDailyWorkout());
        System.out.println(practiceCoach.getDailyWorkout());

        //System.out.println(coach.getDailyFortune());
        System.out.println(practiceCoach.getDailyFortune());

        //close the container
        context.close();

    }

}
