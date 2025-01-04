package com.qa.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBase.Testbase;

public class LoginPage extends Testbase
{
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(id = "email") private WebElement usernameTextBox;
	
	@FindBy(id = "password") private WebElement passwordTextBox;
	
	@FindBy(id = "next") private WebElement singInButton;

	
	
	public void EnterUsername(String username)
	{
		usernameTextBox.sendKeys(username);
	}
	public void EnterPassword(String password)
	{
		passwordTextBox.sendKeys(password);
	}
	public void ClickSignInButton() {
		singInButton.click();
	}
}
