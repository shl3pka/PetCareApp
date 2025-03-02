package org.example;

import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {
    @Bean
    Pet catBarsik(){
        Pet cat = new Pet();
        cat.setTypeOfAnimal("Cat");
        cat.setName("Barsik");
        cat.setWeight(6.2);
        cat.setAge(8);
        cat.setVaccined(true);
        cat.setHistory("Barsik don't like fish");
        return cat;
    }
}
