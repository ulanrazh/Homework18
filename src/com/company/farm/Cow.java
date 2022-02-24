package com.company.farm;

public class Cow extends Animals {

    public Cow() {
    }

    public Cow(float weight, byte age, String gender, String nickName) {
        super(weight, age, gender, nickName);
    }

    @Override
    public String toString() {
        return "Cow{} " + super.toString();
    }
}

