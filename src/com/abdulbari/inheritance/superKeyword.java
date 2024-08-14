package com.abdulbari.inheritance;

class Cuboid extends Rectangle{

    int height;
    int x = 20;

    Cuboid(int length, int breadth, int height) {
        super(length, breadth);
        this.height = height;
    }

    void display() {
        System.out.println(super.x);
        System.out.println(x);
    }
}

public class superKeyword {
    public static void main(String[] args) {
        Cuboid cu = new Cuboid(10,20,30);
        cu.display();
    }
}
