package com.abdulbari.Networks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket stk = new Socket("localhost", 2000);
        //read from the keyboard
        BufferedReader keyb = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(stk.getInputStream()));
        PrintStream pr = new PrintStream(stk.getOutputStream());

        String msg;

        do {
            msg = keyb.readLine();
            pr.println(msg);
            msg = br.readLine();
            System.out.println("From Server : " + msg);
        } while (!msg.equals("dne"));
    }
}
