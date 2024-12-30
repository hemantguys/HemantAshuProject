package com.qa.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBase.Testbase;

public class Homepage extends Testbase
{
	public Homepage()
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[@class='main-get-started-button']")
	private WebElement startbutton;
	
	public void click_startButton()
	{
		startbutton.click();
	}
	
	@FindBy(xpath  = "//button[@class='ms-Button ms-Button--icon root-79']") private WebElement RegisterButton;
	public void ClickRegisterButton()
	{
		RegisterButton.click();
	}
	
}
