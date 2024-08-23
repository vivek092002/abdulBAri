package com.abdulbari.IOStreams.fileOutput;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileExample {
    public static void main(String[] args) throws Exception{

        try {
            FileOutputStream fos = new FileOutputStream("/Users/JAVA/JAVApractice/src/com/abdulbari/IOStreams/fileOutput/Text.txt");
            String str = "Learn Java Programming";
            fos.write(str.getBytes());
            fos.close();
        } catch (FileNotFoundException e){
            System.out.println("Not Found");
        } catch (IOException e){
            System.out.println("Not Found" + e);
        }
    }
}
