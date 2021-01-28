package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Jenga {

    ArrayList<Integer> Jenga = new ArrayList<Integer>();

    public void jengaListCreating(int lineLenght) {
        while (Jenga.size() < lineLenght) {
            Jenga.add((int) (Math.random() * 100));
        }
        System.out.println(Jenga.toString());
    }

    public void revoveRaddomAddToEnd() {
        Random rand = new Random();
        int counter = 1;
        while (counter < 4) {
            for (int i = 0; i < counter; i++) {
                int randomIndex = rand.nextInt(Jenga.size());
                int randomElement = Jenga.get(randomIndex);
                System.out.println("Moving element " + randomElement + " with index "+randomIndex + " to the end of the list.");
                Jenga.remove(randomIndex);
                Jenga.add(randomElement);
                System.out.println(Jenga.toString());
            }
           counter++;

        }
    }
    }