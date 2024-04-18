package com.example.SpringDemo1;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class RandomFortuneService implements FortuneService{

    private final List<String> fortuneList = Arrays.asList(
            "Today is your lucky day!!",
            "You are going to accomplish a lot today!",
            "!!!!!!!!!!!!!"
    );

    @Override
    public String getFortune() {
        Random rand = new Random();
        int randomIndex = rand.nextInt(fortuneList.size());
        return fortuneList.get(randomIndex);
    }
}
