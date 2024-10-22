package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class AxesXpathImp {
    public static void main(String[] arg)
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://theautomationzone.blogspot.com/2020/07/xpath-practice.html");
        driver.manage().window().maximize();
        //--to fetch parent-----------either give/parent::* or/parent::tagname or /..
        System.out.println(driver.findElement(By.xpath("//div[@id='Y2']/parent::*")).getAttribute("id"));
        System.out.println(driver.findElement(By.xpath("//div[@id='Y2']/parent::div")).getAttribute("id"));
        System.out.println(driver.findElement(By.xpath("//div[@id='Y2']/..")).getAttribute("id"));
   System.out.println("-------Parent completed-------------");
        //---to fetch ancestor--------------
        List<WebElement> an = driver.findElements(By.xpath("//div[@id='Y2']/ancestor::*"));
        for (WebElement ances : an)
            System.out.println(ances.getTagName());
        System.out.println("-------ancestor completed-------------");
        // to fetch specific ancestor
        System.out.println(driver.findElement(By.xpath("//div[@id='Y2']/ancestor::div[@id='A']")).getAttribute("id"));

        System.out.println("-------ancestor with specific id completed-------------");
        //----to fetch ancestor-or-self
                List<WebElement> aos = driver.findElements(By.xpath("//div[@id='Y2']/ancestor-or-self::*"));
        for (WebElement ances1 : aos)
            System.out.println(ances1.getTagName());
        System.out.println("-------ancestor-on-self completed-------------");
        List<WebElement> ch = driver.findElements(By.xpath("//div[@id='B2']/child::*"));
        for (WebElement ch1 : ch)
            System.out.println(ch1.getAttribute("id"));
        System.out.println("-------child completed-------------");
        List<WebElement> de = driver.findElements(By.xpath("//div[@id='B2']/descendant::*"));
        for (WebElement de1 : de)
            System.out.println(de1.getAttribute("id"));
        System.out.println("-------descendant completed-------------");
        System.out.println(driver.findElement(By.xpath("//div[@id='B2']/descendant::div[@id='N1']")).getAttribute("id"));
        System.out.println(driver.findElement(By.xpath("//div[@id='B2']//div[@id='N1']")).getAttribute("id"));
        System.out.println("-------descendant with specific id completed-------------");
        List<WebElement> des = driver.findElements(By.xpath("//div[@id='B2']//*"));
        for (WebElement de1 : de)
            System.out.println(de1.getAttribute("id"));
        System.out.println("-------descendant replaced with // completed-------------");
        List<WebElement> fw = driver.findElements(By.xpath("//div[@id='B3']/following::*"));
        for (WebElement fw1 : fw)
            System.out.println(fw1.getAttribute("id"));
        System.out.println("-------following completed-------------");
        System.out.println(driver.findElement(By.xpath("//div[@id='B2']/following::div[@id='Z1']")).getAttribute("id"));
                System.out.println("-------following with specific id completed-------------");
        List<WebElement> fwsb = driver.findElements(By.xpath("//div[@id='B3']/following-sibling::*"));
        for (WebElement fwsb1 : fwsb)
            System.out.println(fwsb1.getAttribute("id"));
        System.out.println("-------following-sibling completed-------------");
        System.out.println(driver.findElement(By.xpath("//div[@id='B2']/following-sibling::div[@id='B3']")).getAttribute("id"));
        System.out.println("-------following-sibling with specific id completed-------------");
        List<WebElement> psb = driver.findElements(By.xpath("//div[@id='B2']/preceding::*"));
        for (WebElement psb1 : psb)
            System.out.println(psb1.getAttribute("id"));
        System.out.println("-------preceding completed-------------");
        System.out.println(driver.findElement(By.xpath("//div[@id='B2']/preceding-sibling::div[@id='B1']")).getAttribute("id"));
        System.out.println("-------preceding-sibling with specific id completed-------------");
    }
}
