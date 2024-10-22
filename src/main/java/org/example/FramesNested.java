package org.example;

import Excep.ElementNotFound;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FramesNested {
    public static void main(String[] arg)
    {
        WebDriver driver = new ChromeDriver();
        try {
            driver.get("https://demo.automationtesting.in/Frames.html");
            driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']")));
            driver.findElement(By.xpath("//input[@type='text']")).sendKeys("test");

            driver.switchTo().defaultContent();
            //In nested frames element may lie at any frame
            List<WebElement> ifr = driver.findElements(By.xpath("//iframe | //frame"));
            //take out list of all frames
            int sz = driver.findElements(By.xpath("//iframe | //frame")).size();
            //find its size so that we can run loop
            for (int i = 0; i < sz; i++) {
                //goto each frame and check for element
                WebElement iframe = ifr.get(i);
                //switch to that iframe
                driver.switchTo().frame(iframe);
                try {
                    Boolean b = driver.findElement(By.xpath("//input[@type='text']")).isDisplayed();
                    if (b) {
                        driver.findElement(By.xpath("//input[@type='text']")).clear();
                        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("check");
                        System.out.println("element found");

                        break;
                    } else if(i==(sz-1))
                        throw new ElementNotFound();
                } catch (ElementNotFound e) {
                    System.out.println("element not found");

                }
                finally{
                    driver.switchTo().defaultContent();
                }
            }
        }
        catch (Exception e) {
                throw new RuntimeException(e);
            }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
//        finally{
//            driver.close();
//        }
    }
}
