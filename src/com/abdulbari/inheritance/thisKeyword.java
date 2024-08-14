package com.abdulbari.inheritance;


//this
class Rectangle{
    int length;
    int breadth;
    int x = 10;

    Rectangle(int length,int breadth ){
        this.length = length;
        this.breadth = breadth;
    }

    void display(){
        System.out.println("Rectangle's Length : " + this.length);
        System.out.println("Rectangle's Breadth : " + this.breadth);
    }

}

public class thisKeyword {
    public static void main(String[] args) {
        Rectangle re = new Rectangle(10, 15);
        re.display();
    }
}
