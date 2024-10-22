package org.example;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelWB {
    public static void main(String[] arg)
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        File fl = new File("C:\\Users\\Usuario\\Desktop\\test.xls");
        // Specify the path to the Excel file
        FileInputStream fls = null;
        try {
            fls = new FileInputStream(fl);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        Workbook wb = null;
        try {
            wb = new HSSFWorkbook(fls); // Create a Workbook instance from the Excel file
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        //The XSSFWorkbook class is used to handle .xlsx files.
        // If you are working with .xls files, you can use HSSFWorkbook.

        Sheet sh = wb.getSheet("Check");
        // Get the desired sheet (in this case, the sheet named "Login")

        int rowCount = sh.getPhysicalNumberOfRows();
        // Get the number of rows in the sheet
        for(int i=0;i<rowCount;i++)
        {
            Row rw = sh.getRow(i) ;
            // Get the current row
            int colCount = rw.getPhysicalNumberOfCells();
            // Get the number of columns in the row

            // Loop through all the cells in the row
            for(int j=0;j<colCount;j++)
            {
                // Get the cell value and print it
                Cell cl = rw.getCell(j);
                String c1 = null;
                if (cl.getCellType() == CellType.STRING)

                    System.out.println(cl.getStringCellValue()+ " ");

                else if (cl.getCellType() ==CellType.NUMERIC)

                    System.out.println(cl.getNumericCellValue()+ " ");
                System.out.println(i+"  " +j);

                //--------enter data in fb id/pwd
                WebElement em = driver.findElement(By.id("email"));
                WebElement pwd = driver.findElement(By.id("pass"));
                if (i>=1 & j==0 & (cl.getCellType()==CellType.STRING))
                em.sendKeys(cl.getStringCellValue());
                else if (i>=1 & j==0 & (cl.getCellType()==CellType.NUMERIC))
                   em.sendKeys(String.valueOf(cl.getNumericCellValue()));
                if (i>=1 & j==1 & (cl.getCellType()==CellType.STRING))
                    pwd.sendKeys(cl.getStringCellValue());
                else if (i>=1 & j==1 & (cl.getCellType()==CellType.NUMERIC))

                    pwd.sendKeys(String.valueOf(cl.getNumericCellValue()));
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                em.clear();
                pwd.clear();

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }

        }
    }
}
