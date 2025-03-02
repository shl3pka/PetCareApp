package org.example;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import org.example.repository.PetRepository;
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
        kitty.visitVet();
        kitty.displayServiceInfo();

        PetRepository petRepository = context.getBean(PetRepository.class);

        petRepository.save(kitty);
        System.out.println("All pets in repository: " + petRepository.findAll().size());

        System.out.println("Requesting LazyBean...");
        LazyBean lazyBean = context.getBean(LazyBean.class);
        }

    }

