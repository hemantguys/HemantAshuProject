package com.qa.testLayer;

import com.qa.pageLayer.LoginPage;
import com.qa.pageLayer.Quiz_1_Page;
import com.qa.testBase.Testbase;

public class LoginTestPage extends Testbase
{
	public void UserLogin(String username, String password) throws InterruptedException
	{
		LoginPage loginPage=new LoginPage();
		loginPage.EnterUsername(username);
		loginPage.EnterPassword(password);
		Thread.sleep(2000);
		loginPage.ClickSignInButton();
		Thread.sleep(5000);

	}
}
