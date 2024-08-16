package com.abdulbari.multiThreading;

class Runnable1 implements Runnable {
    @Override
    public void run(){
        int i = 1;
        while (true){
            System.out.println(i + "World");
            i++;
        }
    }
}

public class TestRunnable {
    public static void main(String[] args) {
        Runnable1 r = new Runnable1();
        Thread t = new Thread(r);    //for creating object of thread
        t.start();  // for calling the run method in the threading
        int i = 1;
        while (true){
            System.out.println(i + "World");
            i++;
        }
    }
}
