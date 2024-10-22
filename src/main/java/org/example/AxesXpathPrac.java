package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class AxesXpathPrac {
    public static void main(String[] arg) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://theautomationzone.blogspot.com/2020/07/xpath-practice.html");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//label[text()='Name']/following-sibling::div/input")).sendKeys("jhgngj");
        driver.findElement(By.xpath("//label[text()='Father']/following-sibling::div/input")).sendKeys("kukjh");
        driver.findElement(By.xpath("//label[text()='Mother']/following-sibling::div/input")).sendKeys("reytr");
        driver.findElement(By.xpath("//label[text()='Email']/following-sibling::div/input")).sendKeys("nghj");
        driver.findElement(By.xpath("//label[text()='Mobile No.']/following-sibling::div/input")).sendKeys("3232324234");
        driver.findElement(By.xpath("//label[text()='Date of Birth']/following-sibling::div/div/input")).sendKeys("2014-05-02");
        List<WebElement> ls =driver.findElements(By.xpath("//label[text()='Gender']/following-sibling::div/label"));
        for (WebElement lis :ls)
            lis.click();
        WebElement we = driver.findElement(By.xpath("//label[text()='Apply For']/following-sibling::div/select"));
   Select sc = new Select(we);
   List<WebElement> drp = sc.getOptions();
        for (WebElement sc1 :drp)
            sc1.click();
        driver.findElement(By.xpath("//label[text()='Address']/following-sibling::div/textarea")).sendKeys("trydfxz");
       // driver.findElement(By.xpath("//label[text()='Photo']/following-sibling::div/input")).click();
        //driver.findElement(By.xpath("//label[text()='Submit']/following-sibling::div/button")).click();
    }
}
