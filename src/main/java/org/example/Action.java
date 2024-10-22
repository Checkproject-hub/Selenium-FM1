package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;

public class Action {
    public static void main(String[] arg) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/customer-preferences/edit?ie=UTF8&preferencesReturnUrl=%2Fcustomer-preferences%2Fedit%3Fie%3DUTF8%26preferencesReturnUrl%3D%252F%26ref_%3Dtopnav_lang_ais&ref_=topnav_lang_ais");
    driver.manage().window().maximize();
    WebElement we = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
        int x = we.getLocation().getX();
        int y = we.getLocation().getY();
        System.out.println(x+"  " + y);
    Actions a = new Actions(driver);

    a.moveByOffset(x,y).doubleClick().build().perform();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        if (driver.findElement(By.xpath("//h1[contains(text(),'Sign in')]")).isDisplayed()) {
            WebElement we1 = driver.findElement(By.xpath("//input[@id='ap_email']"));
            we1.click();
            a.moveToElement(we1).sendKeys("abc@gmail.com").build().perform();
            WebElement we2 = driver.findElement(By.xpath("//input[@id='continue']"));

            a.moveToElement(we2).click().build().perform();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
         WebElement we3 = driver.findElement(By.xpath("//input[@id='ap_password']"));
         //WebElement we3 = driver.findElement(By.xpath("//span[@id='passwordErrorAnnounce']/following-sibling::*']"));
         a.contextClick(we3).perform();    // as only one method so no need to build()
           a.sendKeys(Keys.ARROW_DOWN)
                 .sendKeys(Keys.ARROW_DOWN)
                 .sendKeys(Keys.ENTER)
                 .perform();



        }
    }
    }
