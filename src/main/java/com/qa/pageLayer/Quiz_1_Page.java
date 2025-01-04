package com.qa.pageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.testBase.Testbase;

public class Quiz_1_Page extends Testbase{
	public Quiz_1_Page()
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
	
	 private By downloadCertificateButton = By.xpath("//button[@Name='Download certificate']"); // Update with actual locator
	//@FindBy(xpath  = "//button[@Name='Download certificate']") private WebElement DownloadCertificateButton;
	 public void ClickDownloadCertificateButton() 
	 {
	        try {
	            WebElement downloadButton = driver.findElement(downloadCertificateButton);
	            downloadButton.click();
	            System.out.println("Download Certificate button clicked.");
	        } catch (Exception e) {
	            System.out.println("Error clicking Download Certificate button: " + e.getMessage());
	        }
	 }
	
	@FindBy(xpath  = "//a[text()='Close and exit']") private WebElement CloseAndExitAfterDownloadCertificate;
	public void ClickCloseAndExitAfterDownloadCertificateButton()
	{
		CloseAndExitAfterDownloadCertificate.click();
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
	
	public static String Get_Quiz_Question() 
	{
		WebElement questionElement = driver.findElement(By.xpath("//div[@id='question-container']"));
		String question= questionElement.getText();
		return question;
	}
	
	@FindBy(xpath = "(//label[contains(@for,'choice-group-option')])[1]") private WebElement option1;
	@FindBy(xpath = "(//label[contains(@for,'choice-group-option')])[2]") private WebElement option2;
	@FindBy(xpath = "(//label[contains(@for,'choice-group-option')])[3]") private WebElement option3;
	@FindBy(xpath = "(//label[contains(@for,'choice-group-option')])[4]") private WebElement option4;
	public void Get_Input_AndClick_Quiz_Option1(int optionIndex) 
	{
		if (optionIndex==0)
		{
			option1.click();
		}
		else if (optionIndex==1)
		{
			option2.click();
		}
		else if (optionIndex==2)
		{
			option3.click();
		}
		else if (optionIndex==3)
		{
			option4.click();
		}
	}
	
	
	@FindBy(xpath  = "//button[contains(@class, 'start-test-link') and .//span[text()='Start Graded Assessment']]") private WebElement StartGradedAssessmentButton;
	public void Click_StartGradedAssessmentButton()
	{
		StartGradedAssessmentButton.click();
	}
	
	@FindBy(xpath  = "//div[@class='sc-eTdEpr fGSaKW']") private WebElement LogoutbuttonImage;
	public void ClickLogoutbuttonImage()
	{
		LogoutbuttonImage.click();
	}
	
	@FindBy(xpath  = "//a[@id='menu-item-Generic_Sign_Out']") private WebElement LogoutButton;
	public void ClickLogoutButton()
	{
		LogoutButton.click();
	}
	
	
}