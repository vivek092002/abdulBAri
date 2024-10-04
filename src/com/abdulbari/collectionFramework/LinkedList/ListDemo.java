package com.abdulbari.collectionFramework.LinkedList;

import java.util.LinkedList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> ll1 = new LinkedList<>();
        LinkedList<Integer> ll2 = new LinkedList<>(List.of(50,60,70,80,90));

        ll1.add(10);
        ll1.addAll(0,ll2);

        ll1.forEach(n->show(n));
    }

    static void show(int n){
       // if (n>60){
            System.out.println(n);
        // }
    }
}
