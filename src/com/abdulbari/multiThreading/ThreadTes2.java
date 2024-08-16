package com.abdulbari.multiThreading;

class MyThread3 extends Thread{
    public MyThread3(String s){
        super(s);
    }

    @Override
    public void run() {
        int count = 1;
        while (true){
            System.out.println(count++);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class ThreadTes2 {
    public static void main(String[] args) throws Exception{
        MyThread3 t = new MyThread3("MY Thread 2");
        t.start();
        t.interrupt();
    }
}
