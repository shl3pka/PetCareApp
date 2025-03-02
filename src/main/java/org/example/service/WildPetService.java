package org.example.service;

import org.springframework.stereotype.Service;

@Service("wildPetService")
public class WildPetService implements PetService {
    @Override
    public void printPetDetails() {
        System.out.println("Managing wild pets.");
    }
}
