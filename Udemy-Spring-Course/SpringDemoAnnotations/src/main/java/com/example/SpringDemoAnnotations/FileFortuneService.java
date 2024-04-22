package com.example.SpringDemoAnnotations;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

@Component
public class FileFortuneService implements FortuneService{

    private String fileName = "D:\\IJava\\Java-Backup\\Udemy-Spring-Course\\SpringDemoAnnotations\\src\\main\\resources\\fortunes.txt";
    private List<String> fortunes;

    private Random rand = new Random();

    public FileFortuneService() {
        System.out.println(">>FileFortuneService : inside constructor method");
    }

    @PostConstruct
    public void postConstructMethod(){
        fortunes = new ArrayList<>();

        File file = new File(fileName);
        System.out.println(">>FileFortuneService : inside postConstructMethod");
        System.out.println("file : " + fileName);

        System.out.println("\nFortunes in folder : ");
        try {
            Scanner scanner = new Scanner((file));
            while(scanner.hasNextLine()){
                String data = scanner.nextLine();
                fortunes.add(data);
                System.out.println(data);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Could not read from file");
            e.printStackTrace();
        }
        System.out.println();
    }

    @Override
    public String getFortune() {
        int index = rand.nextInt(fortunes.size());
        return fortunes.get(index);
    }
}
