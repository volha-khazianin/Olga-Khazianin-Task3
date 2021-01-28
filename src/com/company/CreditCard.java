package com.company;

import java.util.HashSet;
import java.util.Set;

public class CreditCard {

    Set<Long> cardsNumbers = new HashSet<Long>();

    public void creatingCardNumbers(int lineLenght){
        while (cardsNumbers.size() < lineLenght) {
            cardsNumbers.add((long) (Math.random() * 1000000000000L));
        }
        System.out.println(cardsNumbers.toString());
    }
    }


