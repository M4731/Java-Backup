package com.example.SpringDemo1;

public class MyApp {

    public static void main(String[] args) {

        //create the object
        Coach theCoach = new FootballCoach();

        //use the object
        System.out.println(theCoach.getDailyWorkout());

    }

}
