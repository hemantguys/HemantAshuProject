package com.qa.utility;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadWritefromExcel2 {

    private String filePath;

    public ReadWritefromExcel2(String filePath) {
        this.filePath = filePath;
    }

    // Method to read data from Excel
    public String readData(String sheetName, int rowNumber, int cellNumber) {
        try (FileInputStream fis = new FileInputStream(filePath);
             Workbook workbook = new XSSFWorkbook(fis)) {

            Sheet sheet = workbook.getSheet(sheetName);
            Row row = sheet.getRow(rowNumber);
            Cell cell = row.getCell(cellNumber);

            return cell.getStringCellValue();

        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    // Method to write data to Excel
    public void writeData(String sheetName, int rowNumber, int cellNumber, String data) {
        try (FileInputStream fis = new FileInputStream(filePath);
             Workbook workbook = new XSSFWorkbook(fis)) {

            Sheet sheet = workbook.getSheet(sheetName);
            Row row = sheet.getRow(rowNumber);
            if (row == null) {
                row = sheet.createRow(rowNumber);
            }
            Cell cell = row.getCell(cellNumber);
            if (cell == null) {
                cell = row.createCell(cellNumber);
            }
            cell.setCellValue(data);

            try (FileOutputStream fos = new FileOutputStream(filePath)) {
                workbook.write(fos);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Method to enter data into web elements
    public void enterData(WebDriver driver, String usernameXpath, String passwordXpath, String sheetName) {
        String username = readData(sheetName, 0, 0); // First row, first cell
        String password = readData(sheetName, 0, 1); // First row, second cell

        WebElement usernameField = driver.findElement(By.xpath(usernameXpath));
        WebElement passwordField = driver.findElement(By.xpath(passwordXpath));

        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
    }
}
