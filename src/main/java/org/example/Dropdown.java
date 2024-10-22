package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class Dropdown {
    public static void main(String[] arg) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        if (driver.findElement(By.linkText("Create new account")).isEnabled()) ;
        driver.findElement(By.linkText("Create new account")).click();
        driver.findElement(By.name("firstname")).sendKeys("ddsfd");
        driver.findElement(By.name("lastname")).sendKeys("ddsfd");
        //--------Month-------------------------
        WebElement mnth = driver.findElement(By.id("month"));
        Select mn = new Select(mnth);
        //mn.selectByIndex(2);
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        mn.selectByValue("4"); // here give month in number format
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //mn.selectByVisibleText("Jul"); // this data in text format

        System.out.println(mnth.getAttribute("value"));
        // to get selected value of dropdown
        List<WebElement> ls = mn.getOptions(); // taking all options in list
        for (WebElement lis : ls) // displaying using enhanced for loop
        {
            System.out.println(lis.getText());
           lis.click(); // so each time loop will select 1 option
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }

        //--------------------Day--------------------
        WebElement dd = driver.findElement(By.id("day"));
        Select day = new Select(dd);
        day.selectByValue("6");
        //day.selectByIndex(0);
        //day.selectByVisibleText("Day");

        List<WebElement> dl = day.getOptions();
        for (WebElement dayLis :  dl)
        {
            System.out.println(dayLis.getText());
            dayLis.click();
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        }

    }
}