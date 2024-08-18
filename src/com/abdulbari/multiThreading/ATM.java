package com.abdulbari.multiThreading;

class ATM1{
    synchronized public void checkBalance(String str){
        System.out.println(str + " Checking Balance");
        try {
            Thread.sleep(1000);
        } catch (Exception e){}
        System.out.println("BALANCE");
    }

    synchronized public void withdraw(String name, int amount){
        System.out.println(name + "Withdrawing");
        try {
            Thread.sleep(1000);
        } catch (Exception e){}
        System.out.println(amount);
    }
}

class customer extends Thread{
    String name;
    int amount;
    ATM1 atm;

    customer(String name, int amount, ATM1 atm) {
        this.name = name;
        this.amount = amount;
        this.atm = atm;
    }

    public void useAtm(){
        atm.checkBalance(name);
        atm.withdraw(name,amount);
    }

    @Override
    public void run() {
        useAtm();
    }
}

public class ATM extends Exception{
    public static void main(String[] args) {
        ATM1 atm = new ATM1();
        customer c1 = new customer("VIVEK",2000,atm);
        customer c2 = new customer("KUMAR", 3000, atm);
        c1.start();
        c2.start();
    }
}
