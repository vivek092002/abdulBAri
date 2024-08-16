package com.abdulbari.multiThreading;

public class Mythread1 extends Thread {
    public void run(){
        int i = 1;
        while (true){
            System.out.println(i + "Hello");
            i++;
        }
    }

    public static void main(String[] args) {
        Mythread1 t = new Mythread1();
        t.start();

        int i = 1;
        while (true){
            System.out.println(i + "World");
            i++;
        }
    }
}
