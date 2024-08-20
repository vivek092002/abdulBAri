package com.abdulbari.javaLangPackage;

public class wrapperDemo {
    public static void main(String[] args) {

        // for integer
        Integer i = Integer.valueOf(10);
        Integer a = 10;

        // for Byte
        Byte b = 15;
        Byte c = Byte.valueOf("15");
        byte cc = 15;
        Byte d = Byte.valueOf(cc);

        //short
        Short e = Short.valueOf("123");

        //float
        Float f = 12.3f;
        Float g = Float.valueOf("1234.5");

        //Double
        Double h = Double.valueOf("1233.12");


        //Character
        Character j = Character.valueOf('A');

        //Binary Form
        Integer k = Integer.valueOf("11111111",2);
        System.out.println(k);
    }
}
