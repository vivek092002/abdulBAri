package com.abdulbari.multiThreading;

class MyData1{
    int value;
    boolean flag = true;
    synchronized public void setValue(int v) {
        while (flag!=true){
            try {
                wait();
            } catch (Exception e){}
        }
        value = v;
        flag = false;
        notify();
    }

    synchronized public int getValue() {
        int x = 0;

        while (flag != false){
            try{
                wait();
            } catch (Exception e){}
        }

        x = value;
        flag = true;
        notify();
        return x;
    }
}
//PRODUCER
class Producer extends Thread{
    MyData1 dat;

    public Producer(MyData1 dat) {
        this.dat = dat;
    }

    @Override
    public void run() {
        int count = 1;
        while (true){
            dat.setValue(count);
            System.out.println("Producer " + count);
            count++;
        }
    }
}
//Consumer
class Consumer extends Thread{
    MyData1 data;

    public Consumer(MyData1 data) {
        this.data = data;
    }

    @Override
    public void run() {
        int value;
        value = data.getValue();
        System.out.println("Consumer" + value);
    }
}

public class interProcess {
    public static void main(String[] args) {
        MyData1 data = new MyData1();
        Producer p = new Producer(data);
        Consumer c = new Consumer(data);

        p.start();
        c.start();
    }
}
