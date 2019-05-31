package com.training.finalexam11.finalexam11.entity;

import com.training.finalexam11.finalexam11.Eunum.LegCount;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
public class AnimalType {
    private String legCount;
    private String terrain;

    @Enumerated(EnumType.STRING)
    @Column(name = "LegCount")
    private LegCount legCount;
}
