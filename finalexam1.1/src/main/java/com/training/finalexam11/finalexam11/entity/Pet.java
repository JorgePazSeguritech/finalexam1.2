package com.training.finalexam11.finalexam11.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Pet extends Database {
    @Column(name="name")
    private String name;
    private String raceName;
    private String animalType;

    public Pet(String name, String raceName, String animalType) {
        this.name = name;
        this.raceName = raceName;
        this.animalType = animalType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRaceName() {
        return raceName;
    }

    public void setRaceName(String raceName) {
        this.raceName = raceName;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }
}
