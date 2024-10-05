package com.abdulbari.collectionFramework.LinkedList;

import java.util.LinkedList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> ll1 = new LinkedList<>();
        LinkedList<Integer> ll2 = new LinkedList<>(List.of(50,60,70,80,90));

        ll1.add(10);
        ll1.add(0,2);
        ll1.addAll(0,ll2);
        ll1.add(5,70);
        ll1.set(6,100);


        ll1.addFirst(3);
        ll1.addLast(11);



        ll1.forEach(n->show(n));
    }

    static void show(int n){
       // if (n>60){
            System.out.println(n);
        // }
    }
}
