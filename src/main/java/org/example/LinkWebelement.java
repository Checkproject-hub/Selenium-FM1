package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.manager.SeleniumManager;
import org.openqa.selenium.support.ui.Wait;

import java.util.function.Function;

public class LinkWebelement {
        public static void main(String[] args) {
            //System.setProperty("webdriver.chrome.driver","C:\\selenium webdriver\\ChromeDriver\\chromedriver-win64\\chromedriver");
            try
            {
                WebDriver driver = new ChromeDriver();
                driver.manage().window().maximize();
                driver.get("https://www.facebook.com/");

                driver.findElement(By.id("email")).sendKeys("sagar.verma2006@gmail.com");
                //driver.findElement(By.name("pass")).sendKeys("abc");
                //driver.findElement(By.name("login")).click();
                // driver.findElement(By.linkText("Forgot password?")).click();
                driver.findElement(By.partialLinkText("Forgot")).click();
                //partiallinktext is used where one part of link is fixed but other may change
                driver.findElement(By.linkText("Cancel")).click();

                System.out.println(driver.getTitle());
                //driver.quit(); // this will close parent and child windows if any
                //driver.close(); //this will close parent window only
            }
            catch  (Exception e) {
                System.out.println(e);
            }


        }
    }
