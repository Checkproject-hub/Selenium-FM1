package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.manager.SeleniumManager;
import org.openqa.selenium.support.ui.Wait;

import java.util.function.Function;

public class IdNameWebElement {
    public static void main(String[] args) {
        //System.setProperty("webdriver.chrome.driver","C:\\selenium webdriver\\ChromeDriver\\chromedriver-win64\\chromedriver");
try
{
    ChromeOptions cd = new ChromeOptions(); //pass this as argument to getDriverPath below
    // this is used to manipulate chrome in various ways
    //this will help to fetch the path where chrome driver is downloaded
    // by script in our pc
    //String path = SeleniumManager.getInstance().getDriverPath(ChromeOptions);
    //System.out.println(path);{

    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.facebook.com/");

    driver.findElement(By.id("email")).sendKeys("sagar.verma2006@gmail.com");
    driver.findElement(By.name("pass")).sendKeys("abc");
    driver.findElement(By.name("login")).click();
   // driver.findElement(By.linkText("Forgot password?")).click();


    System.out.println(driver.getTitle());
      driver.quit(); // this will close parent and child windows if any
    //driver.close(); //this will
}
catch  (Exception e) {
    System.out.println(e);
}


    }
}