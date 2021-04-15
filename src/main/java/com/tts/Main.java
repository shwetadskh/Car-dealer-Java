package com.tts;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("What model of car are you looking for?");
        String carModel=input.next();

        HashMap<String, String> carMap = new HashMap<>();
        carMap.put("civic", "Honda");
        carMap.put("corolla", "Toyota");
        carMap.put("pilot", "Honda");
        carMap.put("miataa", "Mazda");

        String make = carMap.get(carModel.toLowerCase());

        if (make == null) {
            System.out.println("Sorry we don't have that Model!!");
        } else {
            System.out.println("That car is in our " + make + " section!");
        }

    }
}