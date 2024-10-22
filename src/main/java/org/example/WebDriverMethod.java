package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class WebDriverMethod
    {
        public static void main (String[] arg)
        {

            try {
                WebDriver driver = new ChromeDriver();
                driver.manage().window().maximize();
                driver.get("https://www.facebook.com/"); // to load given url
                String path = driver.getTitle(); //to fetch Title of loaded page
                System.out.println("Title :  " + path);
                String cururl = driver.getCurrentUrl(); // to fetch url of current page
                System.out.println("Current URL  : " + cururl);

                WebElement logid = driver.findElement(By.name("login"));
                String s = logid.getText(); // to get text of WebElement
                System.out.println("Text of Login tab : " + s);
                String t = logid.getTagName();
                System.out.println("TagName of Login tab : " + t); // to get tagname of webelement
                String c = logid.getCssValue("css");
                System.out.println("CssValue of Login tab : " + c); // to get css of webelement
                String atr = logid.getAttribute("id");
                System.out.println ("Attribute of Login tab : " + atr); // to get attribute of that webelement

                Boolean d = driver.findElement(By.id("email")).isDisplayed();
                System.out.println ("Email is displayed or not: " + d); // to check if element is displayed
                Boolean b = driver.findElement(By.id("email")).isEnabled();
                System.out.println ("Email is enabled or not: " + b); // to check if element is active
                Boolean se = driver.findElement(By.id("email")).isSelected();
                System.out.println ("Email is Selected or not: " + b); // to check if element is already selected
                driver.findElement(By.id("email")).sendKeys("sagar.verma2006@gmail.com");
                Thread.sleep(200);
                driver.findElement(By.id("email")).clear(); // to clear webelement
                Thread.sleep(200);
                driver.findElement(By.id("email")).sendKeys("sagar.verma2006@gmail.com");
                driver.findElement(By.name("pass")).sendKeys("abc");
                logid.submit();// to submit any button we can use this
               // logid.click(); // to click
                String pg = driver.getPageSource();
                //System.out.println ("Page source  : " + pg); // to get pagesource  of that webelement
                driver.navigate().refresh(); //refresh the current page
                driver.navigate().back(); // take 1 page back
                driver.navigate().forward(); // take 1 page forward
                driver.navigate().to("https://www.google.com/"); // to load new web page in same tab
                Thread.sleep(1000); // to wait


                driver.quit(); // this will close parent and child windows if any
                //driver.close(); //this will close parent window only
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
