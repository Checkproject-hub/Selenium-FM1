package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Objects;

public class XpathCreation {
    public static void main(String[] arg) {
        try {
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.facebook.com/");
            driver.manage().window().maximize();
            String s  = driver.getTitle();
            if (Objects.equals(s, "Facebook - log in or sign up")) {
                System.out.println("Facebook Loaded");
                driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abc");
                //using 1 attribute in xpath
                driver.findElement(By.xpath("//input[@id='email' or @name='email']")).clear();
                //using 2 attributes in xpath with or
                driver.findElement(By.xpath("//*[@name='email'][@id='email']")).sendKeys("hyt");
                //using 2 attributes in xpath with and n *
                WebElement element = driver.findElement(By.xpath("//button[@name='login']"));
                element.click();
                Thread.sleep(10000);
                boolean c = driver.findElement(By.linkText("Find your account and log in.")).isDisplayed();
               //boolean c = driver.findElement(By.xpath("//div[text(contains,'The email or mobile number you entered isn’t connected to an account')]/a//div")).isDisplayed();
                if (c) driver.findElement(By.xpath("//input[@name='email']")).sendKeys("gfhfhg");
            }
            else System.out.println("Facebook not Loaded");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
