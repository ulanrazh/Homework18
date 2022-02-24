package com.company.farm;

import java.util.Arrays;

public class Farm {

    private String address;
    private int cows;
    private int horses;
    private int sheep;
    private String ownerName;
    private Animals[] animals;

    public Farm() {
    }

    public Farm(String address, String ownerName, Animals[] animals) {
        this.address = address;
        this.ownerName = ownerName;
        this.animals = animals;
        setCows();
        setHorses();
        setSheep();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCows() {
        return cows;
    }

    public void setCows() {
        for (Animals animals1 : animals) {
            if (animals1.getClass().equals(Cow.class)) {
                this.cows++;
            }
        }
    }

    public int getHorses() {
        return horses;
    }

    public void setHorses() {
        for (Animals animals1 : animals) {
            if (animals1.getClass().equals(Horse.class)) {
                this.horses++;
            }
        }
    }

    public int getSheep() {
        return sheep;
    }

    public void setSheep() {
        for (Animals animals1 : animals) {
            if (animals1.getClass().equals(Sheep.class)) {
                this.sheep++;
            }
        }
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public Animals[] getAnimals() {
        return animals;
    }

    public void setAnimals(Animals[] animals) {
        this.animals = animals;
    }

    @Override
    public String toString() {
        return "Farm{" +
                "address='" + address + '\'' +
                ", cows=" + cows +
                ", horses=" + horses +
                ", sheep=" + sheep +
                ", ownerName='" + ownerName +
                '}';
    }
}