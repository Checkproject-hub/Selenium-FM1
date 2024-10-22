package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RadioButton {
    public static void main(String[] arg) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        //driver.findElement(By.xpath("//button[contains(text,'Create new account')]")).click();
        driver.findElement(By.linkText("Create new account")).click();
        List<WebElement> rd = driver.findElements(By.id("sex"));
        for (WebElement we : rd) {
            System.out.println(we.getText());
            we.click();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
