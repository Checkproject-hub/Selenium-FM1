package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Collections;
import java.util.List;

public class XpathWithComplexMethod {
    public static void main(String[] arg) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://theautomationzone.blogspot.com/2020/07/xpath-practice.html");
        driver.manage().window().maximize();

        System.out.println(driver.findElement(By.xpath("//button[text()='random']")).isDisplayed());
        driver.findElement(By.xpath("//button[text()='random']")).click();
        System.out.println(driver.findElement(By.xpath("//p[contains(text(),'has logged in successfully')]")).getText());
        driver.findElement(By.xpath("//button[text()='change time']")).click();
        System.out.println(driver.findElement(By.xpath("//p[starts-with(text(),'logged in successfully')]")).getText());
        driver.navigate().to("https://theautomationzone.blogspot.com/2020/07/?color=red");
        System.out.println(driver.findElement(By.xpath("//table['@id=table2']//tr[3]/td[3]")).getText());
        System.out.println(driver.findElement(By.xpath("//table['@id=table2']//tr[position()=2]/td[position()=2]")).getText());
        System.out.println(driver.findElement(By.xpath("//table['@id=table2']//tr[last()]/td[last()]")).getText());
        System.out.println(driver.findElement(By.xpath("//table['@id=table2']//tr[last()-1]/td[last()-2]")).getText());
        // below will count table with 6 rows
        System.out.println(driver.findElement(By.xpath("//table[count(.//tr)= 6]")).isDisplayed());
        System.out.println(driver.findElement(By.xpath("//button[text()='No Space']")).isDisplayed());
        driver.findElement(By.xpath("//button[text()='No Space']")).click();
        System.out.println(driver.findElement(By.xpath("//p[normalize-space(text())='Tommy']")).getText());


        driver.findElement(By.xpath("//button[text()='Preceding Space']")).click();
        System.out.println(driver.findElement(By.xpath("//p[normalize-space(text())='Tommy']")).getText());

        driver.findElement(By.xpath("//button[text()='Trailing Space']")).click();
        System.out.println(driver.findElement(By.xpath("//p[normalize-space(text())='Tommy']")).getText());

        driver.findElement(By.xpath("//button[text()='Preceding And Trailing Space']")).click();
        System.out.println(driver.findElement(By.xpath("//p[normalize-space(text())='Tommy']")).getText());

        //-----------contains,starts,with ,normalize space can be used with other attributes other than text
        driver.findElement(By.xpath("//button[text()='Preceding And Trailing Space']")).click();
        System.out.println(driver.findElement(By.xpath("//p[contains(@name,'aa')]")).getText());

        driver.findElement(By.xpath("//button[text()='Trailing Space']")).click();
        System.out.println(driver.findElement(By.xpath("//p[starts-with(@id,'randomText')]")).getText());
//-----translate(text(),'ABC....Z','abc...z')='dfsdfd'
        //so translate(text(),from String , to string)='string to match'
        //also can be used to change few characters of string to other
        // translate(text(),'Pri','pRI')='pRIyA'
        driver.findElement(By.xpath("//button[text()='UPPER CASE']")).click();
        System.out.println(driver.findElement(By.xpath("//p[translate(text(),'abcdefghijklmnopqrstuvwxyz','ABCDEFGHIJKLMNOPQRSTUVWXYZ')='TOMMY']")).getText());
// ------to use normalize space and upper or lower case together

        driver.findElement(By.xpath("//button[text()='Preceding And Trailing Space']")).click();
        System.out.println(driver.findElement(By.xpath("//p[normalize-space(translate(text(),'abcdefghijklmnopqrstuvwxyz','ABCDEFGHIJKLMNOPQRSTUVWXYZ')='TOMMY')]")).getText());

//-----------to use string-length

        List<WebElement> para = driver.findElements(By.xpath("//p[string-length(text())>50]"));
        for (WebElement ls : para)
            System.out.println(ls.getText());
        driver.findElement(By.xpath("//button[text()='random']")).click();
        System.out.println(driver.findElement(By.xpath("//p[substring-after(text(),':')=' name=a id=a']")).getText());
        System.out.println(driver.findElement(By.xpath("//p[substring-before(text(),':')='unique combination of attributes ']")).getText());

        //------to use round
        driver.navigate().to("https://www.bmv.com.mx/en/markets/equity");
        System.out.println(driver.findElement(By.xpath("//table[@id='tableMercados']/tbody/tr[1]/td[6][round(text())=183]")).isDisplayed());
        System.out.println(driver.findElement(By.xpath("//table[@id='tableMercados']/tbody/tr[1]/td[6][round(text())=183]")).getText());
        System.out.println(driver.findElement(By.xpath("//table[@id='tableMercados']/tbody/tr[1]/td[6][floor(text())=182]")).getText());
    }
}

