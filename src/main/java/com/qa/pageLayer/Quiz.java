package com.qa.pageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBase.Testbase;

public class Quiz extends Testbase{
	public Quiz()
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath  = "//div[@class='ms-ChoiceField-wrapper']//label//div[text()='All of the Above']") private WebElement Quiz_1_Ques_1;
	public void Click_Quiz_1_Ques_1()
	{
		//Select s1 = new Select(Quiz_1_Ques_1);
		//s1.selectByVisibleText("All of the Above");
		Quiz_1_Ques_1.click();
	}
	
	@FindBy(xpath  = "//button[@class='sc-gsKyO fQFZNA']") private WebElement Quiz_1_NextButton;
	public void Click_Quiz_1_NextButton()
	{
		Quiz_1_NextButton.click();
	}
	
	@FindBy(xpath  = "//div[@class='ms-ChoiceField-wrapper']//label//div[text()='Save']") private WebElement Quiz_1_Ques_2;
	public void Click_Quiz_1_Ques_2()
	{
		Quiz_1_Ques_2.click();
	}
	
	@FindBy(xpath  = "//button[@Name='Submit']") private WebElement Quiz_1_SubmitButton;
	public void Click_Quiz_1_SubmitButton()
	{
		Quiz_1_SubmitButton.click();
	}
	
	@FindBy(xpath  = "//button[@name='Back to the course']") private WebElement Quiz_1_BackToCourseButton;
	public void Click_Quiz_1_BackToCourseButton()
	{
		Quiz_1_BackToCourseButton.click();
	}
	
	
	@FindBy(xpath  = "//div[@class='ms-ChoiceField-wrapper']//label//div[text()='Superscript']") private WebElement Quiz_2_Ques_1;
	public void Click_Quiz_2_Ques_1()
	{
		Quiz_2_Ques_1.click();
	}
	
	@FindBy(xpath  = "//div[@class='ms-ChoiceField-wrapper']//label//div[text()='Print a document']") private WebElement Quiz_2_Ques_2;
	public void Click_Quiz_2_Ques_2()
	{
		Quiz_2_Ques_2.click();
	}
	
	public static void Get_Input_AndClick_Quiz_Option(String optionText) 
	{
	    String dynamicXPath = "//div[@class='ms-ChoiceField-wrapper']//label//div[text()='" + optionText + "']";
	    WebElement Quiz_Ques_1 = driver.findElement(By.xpath(dynamicXPath));
	    Quiz_Ques_1.click();
	}
	
	@FindBy(xpath  = "//button[contains(@class, 'start-test-link') and .//span[text()='Start Graded Assessment']]") private WebElement StartGradedAssessmentButton;
	public void Click_StartGradedAssessmentButton()
	{
		StartGradedAssessmentButton.click();
	}
}
