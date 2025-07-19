package com.qa.utility;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

public class ReadWritefromExcel2 {

    public static String filePath = System.getProperty("user.dir") + java.io.File.separator +
            "src" + java.io.File.separator +
            "test" + java.io.File.separator +
            "resources" + java.io.File.separator +
            "testData" + java.io.File.separator +
            "Book1.xlsx";
   public String sheet1 = "Sheet1";

    public String readData(String sheetName, int rowNumber, int cellNumber) {
        try (FileInputStream fis = new FileInputStream(filePath);
             Workbook workbook = new XSSFWorkbook(fis)) {

            Sheet sheet = workbook.getSheet(sheetName);
            Row row = sheet.getRow(rowNumber);
            if (row == null) {
                return null;
            }
            Cell cell = row.getCell(cellNumber);
            return cell != null ? cell.getStringCellValue() : null;

        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void writeData(String sheetName, int rowNumber, int cellNumber, String data) {
        try (FileInputStream fis = new FileInputStream(filePath);
             Workbook workbook = new XSSFWorkbook(fis)) {

            Sheet sheet = workbook.getSheet(sheetName);
            Row row = sheet.getRow(rowNumber);
            if (row == null) {
                row = sheet.createRow(rowNumber);
            }
            Cell cell = row.createCell(cellNumber);
            cell.setCellValue(data);

            try (FileOutputStream fos = new FileOutputStream(filePath)) {
                workbook.write(fos);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void enterData(WebDriver driver, String usernameXpath, String passwordXpath, String sheetName) {
        String username = readData(sheetName, 0, 0);
        String password = readData(sheetName, 0, 1);

        WebElement usernameField = driver.findElement(By.xpath(usernameXpath));
        WebElement passwordField = driver.findElement(By.xpath(passwordXpath));

        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
    }

    @DataProvider(name = "loginData")
    public static Object[][] getLoginData() {
        try (FileInputStream fis = new FileInputStream(filePath);
             Workbook workbook = new XSSFWorkbook(fis)) {

            Sheet sheet = workbook.getSheet("Sheet1");
            int rowCount = sheet.getPhysicalNumberOfRows();
            int cellCount = sheet.getRow(0).getPhysicalNumberOfCells();

            List<Object[]> data = new ArrayList<>();

            for (int i = 1; i < rowCount; i++) {
                Row row = sheet.getRow(i);
                if (row != null) {
                    String flag = row.getCell(2) != null ? row.getCell(2).getStringCellValue() : "";

                    if ("Y".equalsIgnoreCase(flag)) {
                        Map<String, String> rowData = new HashMap<>();
                        for (int j = 0; j < cellCount; j++) {
                            Cell cell = row.getCell(j);
                            rowData.put(sheet.getRow(0).getCell(j).getStringCellValue(), cell != null ? cell.toString() : "");
                        }
                        data.add(new Object[]{rowData, i});
                    }
                }
            }

            return data.toArray(new Object[0][0]);

        } catch (IOException e) {
            e.printStackTrace();
            return new Object[0][0];
        }
    }

    public static void writeTestStatus(String sheetName, int rowNumber, String columnHeader, String status) {
        try (FileInputStream fis = new FileInputStream(filePath);
             Workbook workbook = new XSSFWorkbook(fis)) {

            Sheet sheet = workbook.getSheet(sheetName);
            Row headerRow = sheet.getRow(0);
            int columnCount = headerRow.getPhysicalNumberOfCells();
            int columnIndex = -1;

            for (int i = 0; i < columnCount; i++) {
                if (headerRow.getCell(i).getStringCellValue().equalsIgnoreCase(columnHeader)) {
                    columnIndex = i;
                    break;
                }
            }

            if (columnIndex != -1) {
                Row row = sheet.getRow(rowNumber);
                if (row == null) {
                    row = sheet.createRow(rowNumber);
                }
                Cell cell = row.createCell(columnIndex);
                cell.setCellValue(status);

                try (FileOutputStream fos = new FileOutputStream(filePath)) {
                    workbook.write(fos);
                }
            } else {
                System.out.println("Column header not found: " + columnHeader);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
