package com.example.SpringDemo1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

    public static void main(String[] args) {

        //load the spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

        //retrieve beans from spring container
        Coach theCoach = context.getBean("myCoach", Coach.class);
        Coach alphaCoach = context.getBean("myCoach", Coach.class);

        //check if they are the same
        boolean result = (theCoach == alphaCoach);
        System.out.println(result);
        System.out.println("Memory location the theCoach : " + theCoach);
        System.out.println("Memory location the alphaCoach : " + alphaCoach);


    }

}
