package com.example.SpringDemoAnnotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {

    public static void main(String[] args) {

        //read spring config java class
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

        //get the bean from the spring container
        SwimCoach coach = context.getBean("swimCoach",SwimCoach.class);

        //call a method on the bean
        System.out.println(coach.getDailyWorkout());

        System.out.println(coach.getDailyFortune());

        //call new methods
        System.out.println("email : " + coach.getEmail());
        System.out.println("team : " + coach.getTeam());

        //close the container
        context.close();

    }

}
