package com.example.SpringDemo1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

    public static void main(String[] args) {
        //load the spring configuration file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        //retrieve a bean from the spring container
        Coach theCoach = context.getBean("myCoach", Coach.class);

        //call methods on bean
        System.out.println(theCoach.getDailyWorkout());

        //fortune service methods
        System.out.println(theCoach.getDailyFortune());

        //close the context
        context.close();
    }

}
