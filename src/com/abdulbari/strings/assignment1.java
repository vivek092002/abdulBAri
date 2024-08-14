package com.abdulbari.strings;

public class assignment1 {
    public static void main(String[] args) {
        //find if email is from gmail
        //find the username and domain name from email id
        String str = "kumar.vivek092002@gmail.com";

        int i = str.indexOf("@");
        String user = str.substring(0,i);
        String domain = str.substring(i+1, str.length());

        System.out.println("Username : " + user);
        System.out.println("Domain Name : "+ domain);

        System.out.println(domain.startsWith("gmail"));
    }
}
