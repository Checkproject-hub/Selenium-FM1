package org.example;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.manager.SeleniumManager;
import org.openqa.selenium.support.ui.Wait;

import java.util.function.Function;

public class Xpath {

        public static void main(String[] args) {
            //System.setProperty("webdriver.chrome.driver","C:\\selenium webdriver\\ChromeDriver\\chromedriver-win64\\chromedriver");
            try
            {
                WebDriver driver = new ChromeDriver();
                driver.manage().window().maximize();
                driver.get("https://www.facebook.com/");

                driver.findElement(By.xpath("//input[@id='email']")).sendKeys("sagar.verma2006@gmail.com");
              // driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/input[1]"));
                // above absolute xpath is not working for email
                driver.findElement(By.xpath(" //input[@id='pass']")).sendKeys("abc");
                driver.findElement(By.name("login")).click();


                System.out.println(driver.getTitle());
                //driver.quit(); // this will close parent and child windows if any
                //driver.close(); //this will close parent window only
            }
            catch  (Exception e) {
                System.out.println(e);
            }
        }
    }