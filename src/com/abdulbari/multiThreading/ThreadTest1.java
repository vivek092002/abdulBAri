package com.abdulbari.multiThreading;

class MyRun implements Runnable{
    @Override
    public void run(){}
}

public class ThreadTest1 {
    public static void main(String[] args) throws Exception{
        Thread t = new Thread(new MyRun());
    }
}
