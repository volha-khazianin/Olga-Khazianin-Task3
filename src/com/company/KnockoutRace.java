package com.company;

import java.util.Deque;
import java.util.LinkedList;

public class KnockoutRace {

    public void knockoutRaceResult(){
    Deque<String> knockoutRace = new LinkedList<>();
        System.out.println("The knockout race is starting!");
        knockoutRace.addLast("Susan");
        knockoutRace.addLast("Bob");
        knockoutRace.addFirst("Maria");
        knockoutRace.addLast("Kevin");
        knockoutRace.addLast("Diana");
        knockoutRace.addFirst("Kiki");
        knockoutRace.addFirst("Olga");
        System.out.println(knockoutRace.toString());
        System.out.println(knockoutRace.removeLast()+" left the race");
        System.out.println(knockoutRace.toString());
        System.out.println(knockoutRace.removeLast()+" left the race");
        System.out.println(knockoutRace.toString());
        System.out.println(knockoutRace.removeLast()+" left the race");
        System.out.println(knockoutRace.toString());
        System.out.println(knockoutRace.removeLast()+" left the race");
        System.out.println(knockoutRace.toString());
        System.out.println(knockoutRace.removeLast()+" left the race");
        System.out.println(knockoutRace.toString());
        System.out.println(knockoutRace.removeLast()+" left the race");
        System.out.println(knockoutRace.toString());
        System.out.println(knockoutRace.removeLast()+" won the race!!");
}
}