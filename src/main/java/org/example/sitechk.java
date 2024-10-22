package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class sitechk {
    public static void main(String[] arg) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://theautomationzone.blogspot.com/2020/07/");
        driver.manage().window().maximize();
        if (driver.findElements(By.name("color")).isEmpty())
            System.out.println("List is empty");
        else {
            List<WebElement> ls = driver.findElements(By.name("color"));
            for (WebElement lis : ls) {
                System.out.println(lis.getText());
                lis.click();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        driver.findElement(By.id("cricket")).click();
        driver.findElement(By.id("tennis")).click();
        driver.findElement(By.id("football")).click();
        WebElement we = driver.findElement(By.id("mySelect"));
        Select sc = new Select(we);
        //sc.selectByIndex(2);
        sc.selectByValue("apple");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        List<WebElement> ls = sc.getOptions();
        for (WebElement lis : ls) {
            System.out.println(lis.getText());
            lis.click();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }

       // driver.findElement(By.xpath("(//input[@class='input-xlarge'])[1]")).sendKeys("dfds");
       // driver.findElement(By.xpath("(//input[@class='input-xlarge'])[2]")).sendKeys("gdfgd");
       // driver.findElement(By.xpath("(//input[@class='input-xlarge'])[3]")).sendKeys("hgf");
        driver.findElement(By.xpath("(//input[@class='input-xlarge'])[4]")).sendKeys("jhkbv ");
        driver.findElement(By.xpath("(//input[@class='input-xlarge'])[5]")).sendKeys("453535");
        driver.findElement(By.xpath("(//input[@class='input-large'])[1]")).sendKeys("1986-02-14");
      //  driver.findElement(By.xpath("//label[@for='gender'][class='control-label']"));

    }
}
