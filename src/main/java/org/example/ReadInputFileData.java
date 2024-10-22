package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadInputFileData {
    public static void main(String[] arg)
    {
        String fpath = "C:\\Users\\Usuario\\Desktop\\Test.txt";
        File file =new File(fpath);
        // Create a File object using the file path
        Scanner sc = null;
        try {
            sc = new Scanner( file);
            //the Scanner class expects a File object (or InputStream, etc.) to read from, not a string.
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        while(sc.hasNextLine()) {
           System.out.println(sc.nextLine());
       }
    }
}
