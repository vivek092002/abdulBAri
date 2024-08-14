package com.abdulbari.methods;

public class primeNumber {
    public static void main(String[] args) {
        int n = 12;
        System.out.println(isPrime(n));
    }

    static boolean isPrime(int n){
        for (int i = 2; i < n/2; i++) {
            if (n%i==0){
                return false;
            }
        }
        return true;
    }
}
