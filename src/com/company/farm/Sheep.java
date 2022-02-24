package com.company.farm;

public class Sheep extends Animals{

    public Sheep() {
    }

    public Sheep(float weight, byte age, String gender, String nickName) {
        super(weight, age, gender, nickName);
    }

    @Override
    public String toString() {
        return "Sheep{} " + super.toString();
    }
}
