package com.abdulbari.strings;


public class stringComparing {
    public static void main(String[] args) {
        String str1 = "JAVA";
        String str2 = "JAVA";
        System.out.println(str1==str2);

        String str3 = new String("JAVA");
        System.out.println(str1==str3);

        System.out.println(str1.equals(str3));
    }
}
