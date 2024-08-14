package com.abdulbari.abstractClass;

abstract class Shape{
    abstract public double area();
    abstract public double perimeter();
}

class Circle extends Shape{

    double radius;
    @Override
    public double area(){
        return Math.PI*radius*radius;
    }

    @Override
    public double perimeter(){
        return 2*Math.PI*radius;
    }
}

public class challenge1 {
    public static void main(String[] args) {
        Shape sh = new Circle();
        sh.area();
    }
}
