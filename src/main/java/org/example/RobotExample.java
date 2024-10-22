package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.event.InputEvent;

public class RobotExample {
    public static void main(String[] arg) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");

// Use Robot to move the mouse and click on the search button
        Robot robot = null;
        try {
            robot = new Robot();
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }
        Point point = driver.findElement(By.name("btnK")).getLocation(); // Google search button
        robot.mouseMove(point.x, point.y);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

        //-----Naukri site
        driver.navigate().to("https://www.naukri.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("login_Layer")).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("priyankashri21@gmail.com");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("AayuAnvi1%");
       Actions a = new Actions(driver);
        WebElement btn = driver.findElement(By.xpath("//button[@type='submit'][contains(text(),'Login')]"));
       a.moveToElement(btn).click().perform();


        //driver.findElement(By.xpath("//button[@type='submit'][contains(text(),'Login')]")).click();
        driver.findElement(By.xpath("//img[@alt='naukri user profile img']")).click();

    }
}