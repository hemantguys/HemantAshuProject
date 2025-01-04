package com.qa.testBase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.qa.utility.ReadWritefromExcel2;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testbase {

    public static WebDriver driver;
    private static final String DOWNLOAD_FILE_PATH = "D:\\archetype-fitgoodies-quickstart\\DownloadCertificates\\";
    private static final String FILE_PATH = "D:\\archetype-fitgoodies-quickstart\\src\\main\\java\\com\\qa\\testData\\Book1.xlsx";
    private static final String SHEET_NAME = "Sheet1";

    @BeforeMethod
    public void setUp() {
        System.setProperty("filePath", FILE_PATH);
        System.setProperty("sheetName", SHEET_NAME);
     //   new ReadWritefromExcel2(FILE_PATH); // Initialize ReadWritefromExcel2 with file path

        String browser = "Chrome"; // Update as necessary to choose the browser
        driver = setupBrowser(browser);
        
        driver.get("https://schools.myp2e.org/");  // Replace with your URL
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
    }

    private WebDriver setupBrowser(String browser) {
        WebDriver driver = null;
        switch (browser.toLowerCase()) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("download.default_directory=" + DOWNLOAD_FILE_PATH);
                chromeOptions.addArguments("--disable-notifications");
                driver = new ChromeDriver(chromeOptions);
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                FirefoxOptions firefoxOptions = new FirefoxOptions();
                firefoxOptions.addPreference("browser.download.dir", DOWNLOAD_FILE_PATH);
                firefoxOptions.addPreference("browser.download.folderList", 2);
                firefoxOptions.addPreference("browser.helperApps.neverAsk.saveToDisk", "application/pdf");
                driver = new FirefoxDriver(firefoxOptions);
                break;
            case "edge":
                WebDriverManager.edgedriver().setup();
                EdgeOptions edgeOptions = new EdgeOptions();
                edgeOptions.addArguments("download.default_directory=" + DOWNLOAD_FILE_PATH);
                driver = new EdgeDriver(edgeOptions);
                break;
            default:
                System.out.println("Please choose a valid driver");
                break;
        }
        return driver;
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
        //    driver.quit();
        }
    }
}
