package org.example;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFile {
    public static void main (String[] arg){
        Properties p = new Properties();
File fl = new File("C:\\Users\\Usuario\\Desktop\\stud.properties");

        FileInputStream fis = null;
        try {
            fis = new FileInputStream(fl);
           //create notepad filename by name.properties
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        try {
            p.load(fis);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // this will load fis  data to p
    System.out.println(p.getProperty("Name"));
        System.out.println(p.getProperty("Course"));
        System.out.println(p.getProperty("Sub-Course"));
        System.out.println(p.getProperty("Duration"));
    }
}
