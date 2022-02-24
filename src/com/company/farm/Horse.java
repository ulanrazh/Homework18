package com.company.farm;

public class Horse extends Animals {

    public Horse() {
    }

    public Horse(float weight, byte age, String color, String gender, String nickName) {
        super(weight, age, color, gender, nickName);
    }

    @Override
    public String toString() {
        return "Horse{} " + super.toString();
    }
}
