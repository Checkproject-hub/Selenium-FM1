package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {
    public static void main(String[] arg) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        if (driver.findElement(By.cssSelector("input[id='email']")).isEnabled())
            driver.findElement(By.cssSelector("input[id='email']")).sendKeys("sdfdf");
        if (driver.findElement(By.cssSelector("input[name='pass']")).isEnabled())
            driver.findElement(By.cssSelector("input[name='pass']")).sendKeys("retret");
        if (driver.findElement(By.linkText("Log In")).isDisplayed())
            driver.findElement(By.linkText("Log In")).click();
       // if (driver.findElement(By.cssSelector("#u_0_5_5l")).isEnabled())
           // driver.findElement(By.cssSelector("#u_0_5_5l")).click();

    }
}
