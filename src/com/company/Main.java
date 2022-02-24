package com.company;

import com.company.farm.*;

public class Main {

    public static void main(String[] args) {
        //Farm1
        Animals[] animals = new Animals[] {
                new Sheep(15.4f,(byte) 4,"Male","Sheep1"),
                new Sheep(25.3f,(byte) 3,"Female","Sheep2"),
                new Sheep(10.2f,(byte) 2,"Male","Sheep3"),
                new Cow(45.5f,(byte) 5,"Female","Cow1"),
                new Cow(35.2f,(byte) 4,"Male","Cow2"),
                new Cow(55.1f,(byte) 3,"Female","Cow3"),
                new Cow(42.3f,(byte) 2,"Male","Cow4"),
                new Cow(40.4f,(byte) 6,"Female","Cow5"),
                new Horse(85.4f,(byte) 2,"Black","Female","Horse1"),
                new Horse(90.3f,(byte) 3,"White","Female","Horse2"),};
        Farm farm = new Farm("Naryn","Ulan", animals);
        System.out.println("Farm 1: " + farm);

        // Farm 2 with another way
        Farm farm1 = new Farm("At-Bashy","Nurlan", new Animals[] {
                new Sheep(33.4f,(byte) 4,"Male","Sheep4"),
                new Cow(55.4f,(byte) 6,"Female","Cow6"),
                new Horse(100.3f,(byte) 3,"Grey","Female","Horse3"),});

        System.out.println(farm1);


        // Additional test without arguments
        Animals[] animals1 = new Animals[] {
                new Sheep(),
                new Cow(),
                new Horse()};

        Farm farm2 = new Farm("Bishkek","Bektur",animals1);
        System.out.println(farm2);
    }
}
