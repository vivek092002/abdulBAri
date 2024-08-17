package com.abdulbari.multiThreading;

class MyThread4 extends Thread{
    @Override
    public void run() {
        int count = 1;
        while (true){
            System.out.println(count++ + "My Thread");
        }
    }
}

public class ThreadTest3 {
    public static void main(String[] args) throws Exception{
        MyThread4 t = new MyThread4();
        t.setDaemon(true);  //sets in background
        t.start();

        int count = 1;
        while (true){
            System.out.println(count++ + "Main");
            Thread.yield();
        }

/*
        //for joining the main thread and wait for completing the process
        Thread mainThread = Thread.currentThread();
        mainThread.join();

 */

/*
        try {
            Thread.sleep(100);
        } catch (Exception e){

        }


 */
    }
}
