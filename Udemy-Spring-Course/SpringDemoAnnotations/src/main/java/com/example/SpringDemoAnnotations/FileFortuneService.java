package com.example.SpringDemoAnnotations;

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

        fortunes = new ArrayList<>();

        File file = new File(fileName);
        System.out.println(">>FileFortuneService : inside default constructor");
        System.out.println("file : " + fileName);

        try {
            Scanner scanner = new Scanner((file));
            while(scanner.hasNextLine()){
                String data = scanner.nextLine();
                fortunes.add(data);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Could not read from file");
            e.printStackTrace();
        }


    }

    @Override
    public String getFortune() {
        int index = rand.nextInt(fortunes.size());
        return fortunes.get(index);
    }
}
