package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class drag {
    public static void main(String[] arg) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/");
        driver.manage().window().maximize();
        Actions a = new Actions(driver);
        driver.findElement(By.xpath("//a[contains(text(),'Droppable')]")).click();
        try {
            if (driver.findElement(By.tagName("iframe")).isEnabled()) {
                System.out.println("Frame  exists");

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                driver.switchTo().frame(0);

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Inside frame");
            }
            else
                System.out.println("Frame doesnot exists");
        }
        catch (Exception e)
        {
            System.out.println("Exception  :" + e);

        }

        WebElement we = driver.findElement(By .xpath("//p[contains(text(),'Drag me to my target')]"));
        WebElement we1 = driver.findElement(By.xpath("//p[contains(text(),'Drop here')]"));
        a.dragAndDrop(we,we1).perform();
        if (we1.getText().contentEquals("Dropped!"))
            System.out.println("Dropped successfully");
            else
                    System.out.println("Dropped not happen");


    }
}
