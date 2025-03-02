package org.example.repository;

import org.example.Pet;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
public class PetRepository {
    private final List<Pet> pets = new ArrayList<>();

    public void save(Pet pet) {
        pets.add(pet);
        System.out.println("Pet added: " + pet.getName());
    }

    public List<Pet> findAll() {
        return pets;
    }
}
