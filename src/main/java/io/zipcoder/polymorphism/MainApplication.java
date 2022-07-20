package io.zipcoder.polymorphism;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class MainApplication {

    public static void main(String[] args) {
        Scanner response = new Scanner(System.in);
        int numberOfPets;
        String typeOfPet;
        String petNames;
        ArrayList<Pets> ownersPets = new ArrayList<>();

        System.out.println("Hello! Welcome to Pet Zone. RAWR! How many pets do you have?");
        numberOfPets = response.nextInt();
        response.nextLine();

        for (int i = 0; i < numberOfPets; i++) {

            System.out.println("What kind of pet do you have?");
            typeOfPet = response.nextLine();
            System.out.println("Well that sounds lovely! Now tell me, what's your pet's name?");
            petNames = response.nextLine();

            if (typeOfPet.equalsIgnoreCase("cat")) {
                ownersPets.add(new Cat(petNames));
            } else if (typeOfPet.equalsIgnoreCase("dog")) {
                ownersPets.add(new Dog(petNames));
            } else if (typeOfPet.equalsIgnoreCase("snake")) {
                ownersPets.add(new Snake(petNames));
            } else {
                ownersPets.add(new Pets(petNames));
            }
        }

        for (int i = 0; i < ownersPets.size(); i++){
            System.out.println("'" + ownersPets.get(i).speak() + "' - " + ownersPets.get(i).getPetName());
        }


    }
}
