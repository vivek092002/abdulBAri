package com.abdulbari.IOStreams.fileInput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileExample {
    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("/Users/JAVA/JAVApractice/src/com/abdulbari/IOStreams/fileInput/Text.txt");){
            String str = "Learn Java Programming";
            fos.write(str.getBytes());
            fos.close();
        } catch (FileNotFoundException e){
            System.out.println("File Not Found");
        } catch (IOException e){
            System.out.println("File Not Found" + e);
        }



        try (FileInputStream fis = new FileInputStream("/Users/JAVA/JAVApractice/src/com/abdulbari/IOStreams/fileInput/Text.txt")){
          /*  byte[] b = new byte[fis.available()];
            fis.read(b);
            String str = new String(b);
            System.out.println(str);
           */
            
            //for printing byte by byte
            int x;
            do {
                x = fis.read();
                if (x!=-1){
                    System.out.print((char)x);
                }
            } while (x!=-1);
        } catch (FileNotFoundException e){
            System.out.println("File Not Found");
        } catch (IOException e){
            System.out.println("FIle Not Found" + e);
        }
    }
}
