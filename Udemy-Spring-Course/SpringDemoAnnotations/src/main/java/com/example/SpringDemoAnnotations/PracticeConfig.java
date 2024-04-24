package com.example.SpringDemoAnnotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PracticeConfig {

    @Bean
    public RandomFortuneService randomFortuneService(){
        return new RandomFortuneService();
    }

    @Bean
    public SecondPracticeCoach secondPracticeCoach(){
        return new SecondPracticeCoach(randomFortuneService());
    }

}
