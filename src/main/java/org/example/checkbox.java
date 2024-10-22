package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkbox {
    public static void main(String[] arg) {
        WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.amazon.com/");
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobile");
        driver.findElement(By.xpath("//input[@value='Go']")).click();
       // driver.findElement(By.linkText("Top Brands")).click();
        driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/span[1]/div[1]/span[1]/div[1]/div[1]/div[4]/ul[2]/span[1]/span[1]/li[1]/span[1]/a[1]/span[1]")).click();
        driver.findElement(By.linkText("Any Department")).click();
    }

}
