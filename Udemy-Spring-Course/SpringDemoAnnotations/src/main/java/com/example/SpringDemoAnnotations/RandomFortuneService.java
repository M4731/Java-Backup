package com.example.SpringDemoAnnotations;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService{

    //create an array of strings
    private String[] data = {
            "Beware of the wolf in sheep's clothing",
            "Diligence is the mother of good luck",
            "The journey is the reward"
    };

    //create a random number generator
    private Random rand = new Random();

    @Override
    public String getFortune() {

        //pick a random string from the array
        int index = rand.nextInt(data.length);
        String fortune = data[index];
        return fortune;

    }
}
