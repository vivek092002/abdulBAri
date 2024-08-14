package com.abdulbari.operators;

import java.util.Scanner;

public class triangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float height, base, area;
        System.out.println("Enter Height and Base");
        height = sc.nextFloat();
        base = sc.nextFloat();

        area = height * base * 0.5f;
        System.out.println("Area of Triangle is : " + area);



        sc.close();
    }
}
