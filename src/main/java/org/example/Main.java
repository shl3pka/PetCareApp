package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Pet kitty = context.getBean(Pet.class);
        System.out.println("Animal type: " + kitty.getTypeOfAnimal());
        System.out.println("Pet name: " + kitty.getName());
        System.out.println("Pet age: " + kitty.getAge() + " years");
        System.out.println("Pet weight: " + kitty.getWeight());
        System.out.println("--------------------------------------");
        System.out.println("Pet history: " + kitty.getHistory());
        }
    }

