package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Objects;

public class WebAlert {
    public static void main(String[] arg) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/alerts");
        driver.manage().window().maximize();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            if (driver.findElement(By.xpath("(//button[contains(text(),'Click me')])[1]")).isEnabled()) {
                                   driver.findElement(By.xpath("(//button[contains(text(),'Click me')])[1]")).click();
                    String txt = driver.switchTo().alert().getText();
                    System.out.println(txt);
                    if (txt.contentEquals("You clicked a button"))
                        driver.switchTo().alert().accept();
                    else
                        System.out.println("No or Incorrect Alert");
                } else
                System.out.println("1st Button not available");
                if (driver.findElement(By.xpath("(//button[contains(text(),'Click me')])[2]")).isEnabled()) {
                     driver.findElement(By.xpath("(//button[contains(text(),'Click me')])[2]")).click();
                        try {
                            Thread.sleep(5000);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        String txt1 = driver.switchTo().alert().getText();
                        System.out.println(txt1);
                        if (txt1.contentEquals("This alert appeared after 5 seconds"))
                            driver.switchTo().alert().accept();
                        else
                            System.out.println("No or Incorrect Alert");
                    } else
                    System.out.println("2nd Button not available");
                    if (driver.findElement(By.xpath("(//button[contains(text(),'Click me')])[3]")).isEnabled()) {
                          driver.findElement(By.xpath("(//button[contains(text(),'Click me')])[3]")).click();
                            try {
                                Thread.sleep(5000);
                            } catch (InterruptedException e) {
                                throw new RuntimeException(e);
                            }
                            String txt2 = driver.switchTo().alert().getText();
                            System.out.println(txt2);
                            if (txt2.contentEquals("Do you confirm action?"))
                                driver.switchTo().alert().dismiss();
                            else
                                System.out.println("No or Incorrect Alert");
                        } else
                        System.out.println("3rd Button not available");
            if (driver.findElement(By.xpath("(//button[contains(text(),'Click me')])[4]")).isEnabled()) {
                driver.findElement(By.xpath("(//button[contains(text(),'Click me')])[4]")).click();
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                String txt3 = driver.switchTo().alert().getText();
                System.out.println(txt3);
                if (txt3.contentEquals("Please enter your name"))
                    driver.switchTo().alert().sendKeys("Testing");
                else
                    System.out.println("No or Incorrect Alert");
            } else
                System.out.println("3rd Button not available");
            }
           catch (Exception e)
                {System.out.println(e);}
        finally{
            driver.close();
        }
        }
    }
