package org.example;

import org.example.service.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class Pet {
    @Autowired
    @Qualifier("domesticPetService")
    private PetService petService;

    public void displayServiceInfo() {
        petService.printPetDetails();
    }
@Autowired
    private Veterinarian veterinarian;
    public void visitVet() {
        veterinarian.checkHealth(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Number getAge() {
        return age;
    }

    public void setAge(Number age) {
        this.age = age;
    }

    public Boolean getVaccined() {
        return isVaccined;
    }

    public void setVaccined(Boolean vaccined) {
        isVaccined = vaccined;
    }

    public String getHistory() {
        return history;
    }

    public void setHistory(String history) {
        this.history = history;
    }

    public String getTypeOfAnimal() {
        return typeOfAnimal;
    }

    public void setTypeOfAnimal(String typeOfAnimal) {
        this.typeOfAnimal = typeOfAnimal;
    }

    public String typeOfAnimal;
    private String name;
    private Number age;

    public Number getWeight() {
        return weight;
    }

    public void setWeight(Number weight) {
        this.weight = weight;
    }

    private Number weight;
    private Boolean isVaccined;
    private String history;
}
