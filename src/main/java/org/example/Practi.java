package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practi
 {
    public static void main(String[] arg) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        System.out.println(driver.getTitle());
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.navigate().to("https://www.google.com/");
        driver.navigate().refresh();
        System.out.println(driver.getTitle());
        driver.get("https://www.facebook.com/");
        System.out.println(driver.getTitle());
        WebElement em = driver.findElement(By.id("email"));
        System.out.println("To chk if enable : "  + em.isEnabled());
       // driver.findElement(By.linkText("Email or phone number")).sendKeys("aaa");
               System.out.println("To chk if displayed : "  + em.isDisplayed());
        em.sendKeys("Welcome");
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement logid = driver.findElement(By.name("login"));
        System.out.println("To chk text of email tab attr:  " + logid.getText());
        em.clear();
        System.out.println("To chk classname attr:  " + em.getAttribute("class"));
        System.out.println("To chk tagname attr : " + em.getTagName());
        System.out.println("To chk cssvalue attr : " + em.getCssValue("background-color"));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //driver.close();
       // driver.quit();
    }
}

