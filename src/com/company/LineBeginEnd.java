package com.company;

import java.util.LinkedList;

public class LineBeginEnd {

    LinkedList<Integer> Line2 = new LinkedList<Integer>();

    public void addingElementsBeginEnd(){
        System.out.println("I'm creating a line with adding elements. Firstly to the beginning and after that to the end of the line!");
         while (Line2.size()<10){
        Line2.addFirst((int)(Math.random() * 100));
        System.out.println(Line2.toString());
        Line2.addLast((int)(Math.random() * 100));
        System.out.println(Line2.toString());
        }
    }

    public void removingElementsEndBegin(){
         System.out.println("I'm removing from the line elements. Firstly from the end and after that from the beginning  of the line!");
         while (Line2.size()>0){
        Line2.removeLast();
        System.out.println(Line2.toString());
        Line2.removeFirst();
        System.out.println(Line2.toString());
        }
        System.out.println("Done! The line is empty!");
    }

}
