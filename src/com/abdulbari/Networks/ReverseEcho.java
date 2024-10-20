//Server Side Of the Architecture

package com.abdulbari.Networks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.*;

public class ReverseEcho {
    public static void main(String[] args) throws IOException {
        //class for accepting the port number from client
        ServerSocket ss = new ServerSocket(2000);
        //accepts the socket
        Socket stk = ss.accept();

        //for reading a line from the client
        //we use input stream inside a buffered reader
        BufferedReader brr = new BufferedReader(new InputStreamReader(stk.getInputStream()));

        //for output of the stream we use printStream
        PrintStream pr = new PrintStream(stk.getOutputStream());

        //reverse the msg
        String msg;
        StringBuilder sb;
        do {
            msg = brr.readLine();
            sb = new StringBuilder(msg);
            sb.reverse();
            msg = sb.toString();

            pr.println(msg);
        } while (!msg.equals("dne"));
    }
}
