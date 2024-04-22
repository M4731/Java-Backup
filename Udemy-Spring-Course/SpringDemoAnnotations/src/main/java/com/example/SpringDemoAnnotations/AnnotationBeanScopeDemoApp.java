package com.example.SpringDemoAnnotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

    public static void main(String[] args) {

        //load spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //retrieve beans from spring container
        Coach coach = context.getBean("tennisCoach",Coach.class);
        Coach coach1 = context.getBean("tennisCoach",Coach.class);

        //check if the beans are the same
        boolean result = coach1 == coach;
        System.out.println("Pointing to the same object : " + result);
        System.out.println("Memory location for coach : " + coach);
        System.out.println("Memory location for coach1 : " + coach1);

        //close the context
        context.close();



    }


}
