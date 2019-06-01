package com.training.finalexam11.finalexam11.Eunum;

public enum LegCount {

    ZERO_LEGG("")
    TWO_LEGS("EXTERNAL"),
    FOUR_LEGS("REMOTE");

    ConditionEnum(String value){
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}