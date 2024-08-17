package com.abdulbari.multiThreading;

class MyData{
    synchronized void display(String str){
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i));
            try {
                Thread.sleep(100);
            } catch (Exception e){
                System.out.println(e);
            }
        }
    }
}

class thread1 extends Thread{
    MyData d;
    thread1(MyData d){
        this.d = d;
    }

    @Override
    public void run() {
        d.display("Hello World");
    }
}

class thread2 extends Thread{
    MyData d;
    thread2(MyData d){
        this.d = d;
    }

    @Override
    public void run() {
        d.display("Welcome");
    }
}



public class sync1 {
    public static void main(String[] args) {
        MyData data = new MyData();
        thread1 t1 = new thread1(data);
        thread2 t2 = new thread2(data);

        t1.start();
        t2.start();
    }
}
