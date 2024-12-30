package com.qa.testLayer;

import org.testng.annotations.Test;

import com.qa.pageLayer.LoginPage;
import com.qa.testBase.Testbase;

public class Schools_My_P2e_EndToEnd extends Testbase
{
	@Test
	public void e2e_main_test() throws InterruptedException
	{
		HomeTestPage homeTestPage = new HomeTestPage();
		LoginTestPage loginTestPage= new LoginTestPage();
		Quiz1 quiz1=new Quiz1();
		Quiz2 quiz2 = new Quiz2();
		Quiz3 quiz3= new Quiz3();
		Quiz4 quiz4= new Quiz4();
		Quiz5 quiz5= new Quiz5();
		Quiz6 quiz6= new Quiz6();
		Quiz7 quiz7= new Quiz7();
		Quiz8 quiz8= new Quiz8();
		FinalQuizpage finalQuizpage=new FinalQuizpage();
		
		homeTestPage.HomePage_fun();
		loginTestPage.Login();
		
		homeTestPage.HomePageCourseLibLink_Fun();
		
		quiz1.Quiz_1_test_fun();
		quiz2.Quiz_2_test_fun();
		quiz3.Quiz_3_test_fun();
		quiz4.Quiz_4_test_fun();
		quiz5.Quiz_5_test_fun();
		quiz6.Quiz_6_test_fun();
		quiz7.Quiz_7_test_fun();
		quiz8.Quiz_8_test_fun();
		finalQuizpage.Final_Summary_Page();
		finalQuizpage.Final_Quiz();
	}
}
