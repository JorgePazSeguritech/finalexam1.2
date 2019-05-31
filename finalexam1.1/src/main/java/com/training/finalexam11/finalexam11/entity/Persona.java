package com.training.finalexam11.finalexam11.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Persona extends Database {
@Column (name="name")
private String name;
    private String age;
    private String lista_pets;

    public Persona(String name, String age, String lista_pets) {
        this.name = name;
        this.age = age;
        this.lista_pets = lista_pets;

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getLista_pets() {
        return lista_pets;
    }

    public void setLista_pets(String lista_pets) {
        this.lista_pets = lista_pets;
    }

}
