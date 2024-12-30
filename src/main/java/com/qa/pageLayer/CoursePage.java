package com.qa.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.testBase.Testbase;

public class CoursePage extends Testbase
{
	public CoursePage()
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='21st Century Skills: Certificate Courses']")
	private WebElement courseButton;
	
	public void click_courseButton()
	{
		courseButton.click();
	}

	@FindBy(xpath = "(//span[@class='ms-Pivot-text text-129'])[2]")
	private WebElement courseLibraryLinkbutton;
	
	public void click_courseLibraryLinkButton()
	{
		courseLibraryLinkbutton.click();
	}
	
	@FindBy(xpath = "//div[@class='sc-yaKpG jWekZG']")
	private WebElement courseimgbutton;
	
	public void click_courseimgButton()
	{
		courseimgbutton.click();
	}
	
	@FindBy(className = "landing-languge-dropdown")
	private WebElement CourseDDL;
	
	public void hoverOnCourseDDL()
	{
		Actions act= new Actions(driver);
		act.moveToElement(CourseDDL).build().perform();
		Select s1=new Select(CourseDDL);
		
		s1.selectByValue("English (United States)");
	}
	/*
	@FindBy(className = "shaka-overflow-menu-button shaka-no-propagation material-icons-round shaka-tooltip")
	private WebElement speeddotsonVideo;
	
	public void clickOnSpeedDotOnVideo()
	{
		speeddotsonVideo.click();
	}
	*/
}

