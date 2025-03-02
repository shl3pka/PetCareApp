package org.example.service;

import org.example.Pet;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service("domesticPetService")
public class DomesticPetService implements PetService {
    @Override
    public void printPetDetails() {
        System.out.println("Managing domestic pets.");
    }
}
