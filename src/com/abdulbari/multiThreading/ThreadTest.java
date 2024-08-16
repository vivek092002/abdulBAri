package com.abdulbari.multiThreading;

class MyThread2 extends Thread{
    public MyThread2(String name) {
        super(name);
        setPriority(Thread.MAX_PRIORITY);
    }
}

public class ThreadTest{
    public static void main(String[] args) throws Exception{
        MyThread2 t = new MyThread2("MY THREAD 1");
        System.out.println("ID " + t.threadId());
        System.out.println("Name " + t.getName());
        System.out.println("Priority " + t.getPriority());
        t.start();
        System.out.println("State " + t.getState());
        System.out.println("Alive " + t.isAlive());
    }
}