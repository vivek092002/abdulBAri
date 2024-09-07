package com.abdulbari.collectionFramework.ArrayList;

import java.util.*;

public class ListDemo {
    public static void main(String[] args) {

        //first list
        ArrayList<Integer> al1 = new ArrayList<>(20);
        //second list
        ArrayList<Integer> al2 = new ArrayList<>(List.of(50,60,70,80));

        //add the element
        al1.add(10);
        al1.add(0,5);

        al1.addAll(1,al2);
        al1.set(4,70);

        //System.out.println(al1.contains(50));
        //System.out.println(al1.get(5));

        //System.out.println(al1);

       /* for (int i = 0; i < al1.size(); i++) {
            System.out.println(al1.get(i));
        }
       */

        Iterator<Integer> it = al1.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
