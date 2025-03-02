package org.example;

import org.springframework.stereotype.Component;

@Component
public class Veterinarian {
    public void checkHealth(Pet pet) {
        System.out.println("Cheking health of " + pet.getName());
    }
}
