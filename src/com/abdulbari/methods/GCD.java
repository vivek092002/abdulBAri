package com.abdulbari.methods;

public class GCD {
    public static void main(String[] args) {
        System.out.println(result(35,25));
    }
    static int result(int m, int n){
        while (m!=n){
            if (m>n){
                m = m-n;
            } else {
                n = n -m;
            }
        }
        return m;
    }
}
