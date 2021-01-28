package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        LineToDoctor Line= new LineToDoctor();
        Line.hospitalPatients();

        KnockoutRace Race = new KnockoutRace();
        Race.knockoutRaceResult();

        LineBeginEnd LineBE = new LineBeginEnd();
        LineBE.addingElementsBeginEnd();
        LineBE.removingElementsEndBegin();

        Jenga JengaList = new Jenga();
        JengaList.jengaListCreating(7);
        JengaList.revoveRaddomAddToEnd();

        CreditCard Cards1 = new CreditCard();
        Cards1.creatingCardNumbers(12);

        ListOfUsers Users = new ListOfUsers();
        Users.listOfUser();
        Users.registration();
        Users.removeUser();
    }




}