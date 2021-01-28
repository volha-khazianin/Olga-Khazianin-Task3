package com.company;

import java.util.Deque;
import java.util.LinkedList;

public class LineToDoctor {

        public void hospitalPatients() {
            System.out.println("The start of line to the doctor");
            Deque<Integer> patients = new LinkedList<>();
            patients.addLast(1);
            patients.addLast(2);
            patients.addLast(3);
            patients.addLast(4);
            patients.addLast(5);
            patients.addLast(6);
            patients.addLast(7);
            patients.addLast(8);
            patients.addLast(9);
            patients.addLast(10);
            System.out.println(patients.toString());
            int counter = 1;
            while (patients.size() > 1) {
                if (counter % 3 == 0) {
                    patients.pollLast();
                    System.out.println(patients.toString());
                }
                patients.pollFirst();
                counter++;
                patients.add((int)(Math.random() * 100));
                System.out.println(patients.toString());
            }
            System.out.println("End of line to te doctor!");
        }

}
