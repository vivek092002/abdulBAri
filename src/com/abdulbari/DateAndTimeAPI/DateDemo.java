package com.abdulbari.DateAndTimeAPI;

public class DateDemo {
    public static void main(String[] args) {

        System.out.println("Milli Second from 1 Jan 1970");
        System.out.println(System.currentTimeMillis());

        System.out.println("Total no of seconds passed");
        System.out.println(System.currentTimeMillis()/1000);

        System.out.println("Total no of minutes Passed");
        System.out.println(System.currentTimeMillis()/1000/60);

        System.out.println("Total no of Hours Passed");
        System.out.println(System.currentTimeMillis()/1000/60/60);

        System.out.println("Total no of Days Passed");
        System.out.println(System.currentTimeMillis()/1000/60/60/24);

        System.out.println("Total no of Years Passed");
        System.out.println(System.currentTimeMillis()/1000/60/60/24/365);
    }
}
