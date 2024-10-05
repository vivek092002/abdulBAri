package com.abdulbari.collectionFramework.arrayDeque;

import java.util.ArrayDeque;

public class DequeDemo {
    public static void main(String[] args) {
        ArrayDeque<Integer> dq = new ArrayDeque<>();


        //adding the elements at the last
        dq.offerLast(10);
        dq.offerLast(20);
        dq.offerLast(30);
        dq.offerLast(40);

        //lambda expression for printing all elements
        //dq.forEach((x)-> System.out.println((x)));

        //adding elements at the first  place
        dq.offerFirst(1);
        dq.offerFirst(2);
        dq.offerFirst(3);
        dq.offerFirst(4);

        dq.forEach(System.out::println);
    }
}
