package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ListOfUsers {

    Map<String, String> Users = new HashMap<String, String>();

    Scanner key = new Scanner(System.in);

    public void listOfUser() {
        Users.put("OlgaK", "Olga Khazianin");
        Users.put("Nikki", "Nikki Kim");
        System.out.println(Users.toString());
    }

    public void registration() {
        System.out.println("Please enter User nickname for registration new user!");
        String textKey = key.nextLine();
        System.out.println("Please enter User First name and Last name for registration new user!");
        String name = key.nextLine();
        if (Users.containsKey(textKey)) {
            System.out.println("A user with the same name already exists!");
        } else {
            Users.put(textKey, name);
            System.out.println("Congratulation! You have registered new user with nickName = " +textKey+"!");
            System.out.println(Users.toString());
        }
    }

    public void removeUser(){
        System.out.println("Please enter User nickname for removing!");
        String nickName = key.nextLine();
        if(Users.containsKey(nickName)) {
            Users.remove(nickName);
            System.out.println("You successful remove user nickName Key = "+nickName);
        }
        else {
            System.out.println("There is no user with Key= "+nickName);
        }
        System.out.println(Users.toString());
    }
}
