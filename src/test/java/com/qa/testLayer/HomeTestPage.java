package com.qa.testLayer;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.pageLayer.CoursePage;
import com.qa.pageLayer.Homepage;
import com.qa.pageLayer.Quiz_1_Page;
import com.qa.testBase.Testbase;

public class HomeTestPage extends Testbase
{
	CoursePage c1 = new CoursePage();
	Homepage h1=new Homepage();
	public void HomePage_fun() throws InterruptedException
	{
		
		//Thread.sleep(2000);
		c1.hoverOnCourseDDL();
		Thread.sleep(2000);
		h1.click_startButton();
	}

	public  void HomePageCourseLibLink_Fun() throws InterruptedException
	{
		c1.click_courseLibraryLinkButton();
		
		c1.click_courseimgButton();
		Thread.sleep(2000);
		
	    HomePageClickRegisterButton_Fun();
	}
	
	public  void HomePageClickRegisterButton_Fun()
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		 boolean isModalPresent = false;
         try {
             WebElement modalDialog = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("modal-list-container")));
             isModalPresent = modalDialog.isDisplayed();
         } catch (Exception e) {
             System.out.println("Modal dialog not present.");
         }

         if (isModalPresent) {
             // Locate the "Register" button and click it
             WebElement registerButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@data-automation-id='submit-course-registration']")));
             registerButton.click();
             System.out.println("Clicked on Register button.");
         } else {
             System.out.println("Proceeding without interacting with the modal dialog.");
         }

	}
}
