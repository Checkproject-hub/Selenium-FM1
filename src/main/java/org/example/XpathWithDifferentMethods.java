package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathWithDifferentMethods {
    public static void main(String[] arg)

    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://theautomationzone.blogspot.com/2020/07/xpath-practice.html");
        driver.manage().window().maximize();
        //identify by id,name
       System.out.println( driver.findElement(By.id("id1")).getText());
        System.out.println(driver.findElement(By.name("name1")).getText());
        // identify by xpath("//tagname[attribute='value']")
        System.out.println(driver.findElement(By.xpath("//p[@value='value1']")).getText());
        System.out.println(driver.findElement(By.xpath("//p[@class='class1']")).getText());
        System.out.println(driver.findElement(By.xpath("//div[@class='class1']")).getText());
        // identify by xpath("//tagname[attribute1='value'][attribute2='value']")
        System.out.println(driver.findElement(By.xpath("//p[@name='a'][@id='a']")).getText());
        System.out.println(driver.findElement(By.xpath("//p[@name='a'][@id='b']")).getText());
        System.out.println(driver.findElement(By.xpath("//p[@name='b'][@id='a']")).getText());
        System.out.println(driver.findElement(By.xpath("//p[@name='b'][@id='b']")).getText());
        // identify by xpath("(//tagname[attribute='value'])[index]]
        //as each label is first child in 3 different parents so give expression in bracket()
        System.out.println(driver.findElement(By.xpath("(//label[@id='lable'])[1]")).getText());
        System.out.println(driver.findElement(By.xpath("(//label[@id='lable'])[2]")).getText());
        System.out.println(driver.findElement(By.xpath("(//label[@id='lable'])[3]")).getText());
        //-----------  calling parent object from child..identify child and give/..
    System.out.println(driver.findElement(By.xpath("//span[@id='link'] /..")).getText());

       //calling child from parent..identify parent and give /tagname of child
        driver.findElement(By.xpath("//div[@id='divA']/input")).sendKeys("gthfhgg");
        driver.findElement(By.xpath("//div[@id='divB']/input")).sendKeys("edrtf");
        //calling child from grandparent..identify grandparent and give /tagname of parent then /tagname of child
        driver.findElement(By.xpath("//div[@id='divC']/span/input")).sendKeys("bbcvbf");
        //-----------  calling parent object from child..identify child and pass it as attribute along with parent tag
        System.out.println(driver.findElement(By.xpath("//a[span[@id='link']]")).getText());

    }
}
