package com.qa.testLayer;

import org.testng.annotations.Test;

import com.qa.pageLayer.CoursePage;
import com.qa.pageLayer.CourseVideoPage;
import com.qa.pageLayer.Homepage;
import com.qa.pageLayer.LoginPage;
import com.qa.pageLayer.Quiz_1_Page;
import com.qa.testBase.Testbase;
import com.qa.utility.SleepClass;

public class Login extends Testbase
{
	@Test
	public void Login() throws InterruptedException
	{
		LoginPage lp=new LoginPage();
		Homepage h1=new Homepage();
		CoursePage c1 = new CoursePage();
		CourseVideoPage videopage=new CourseVideoPage();
		Quiz_1_Page quiz_1=new Quiz_1_Page();
		//Thread.sleep(2000);
		c1.hoverOnCourseDDL();
		Thread.sleep(2000);
		h1.click_startButton();
		lp.EnterUsername();
		lp.EnterPassword();
		Thread.sleep(2000);
		lp.ClickSignInButton();
		Thread.sleep(5000);
		
		
		
		
		c1.click_courseLibraryLinkButton();
		//c1.click_courseButton();
		c1.click_courseimgButton();
		videopage.clickPlayButton();
		Thread.sleep(2000);
		videopage.clickOnSpeedDotOnVideo();
		Thread.sleep(2000);
		videopage.clickPlaybackSpeedButton();
		Thread.sleep(1000);
		videopage.ChoosePlaySpeed();
		videopage.clickPlayButton();
		String getvideoTime = videopage.getVideoTime();
		
		String timeAfterSlash=SleepClass.getTimeAfterSlash(getvideoTime);

		// Now convert this time to seconds
		 int totalSeconds = SleepClass.convertToSeconds(timeAfterSlash);
		
		// Now you can send this time to another method
		//SleepClass.sleepBySpecificTime(totalSeconds);
		
		videopage.clickNextButtonAfterVideoComplete();
		videopage.clickNextbutton_Documentpage_Session_1();
		videopage.clickStart_test_session_1();
		System.out.println("Session started to test 1");
		
		//Quiz 1
		Thread.sleep(1000);
		quiz_1.Click_Quiz_1_Ques_1();
		quiz_1.Click_Quiz_1_NextButton();
		Thread.sleep(1000);
		quiz_1.Click_Quiz_1_Ques_2();
		quiz_1.Click_Quiz_1_SubmitButton();
		Thread.sleep(2000);
		quiz_1.Click_Quiz_1_BackToCourseButton();
		
		
		//Quiz 2 start
		Thread.sleep(1000);
		videopage.clickPlayButton();
		Thread.sleep(2000);
		videopage.clickOnSpeedDotOnVideo();
		Thread.sleep(2000);
		videopage.clickPlaybackSpeedButton();
		Thread.sleep(1000);
		videopage.ChoosePlaySpeed();
		videopage.clickPlayButton();
		
        String getvideoTime2 = videopage.getVideoTime();
		
		String timeAfterSlash2=SleepClass.getTimeAfterSlash(getvideoTime2);

		// Now convert this time to seconds
		 int totalSeconds2 = SleepClass.convertToSeconds(timeAfterSlash2);
		
		// Now you can send this time to another method
		//SleepClass.sleepBySpecificTime(totalSeconds);
		
		 Thread.sleep(2000);
		videopage.clickNextbutton_For_all_Page();
		 Thread.sleep(2000);
		videopage.clickNextbutton_For_all_Page();
		 Thread.sleep(2000);
		videopage.clickNextbutton_For_all_Page();
		Thread.sleep(2000);
		videopage.clickStart_test_session_1();
		System.out.println("Session started to Quiz 2");
		
		//Quiz 2
		Thread.sleep(1000);
		quiz_1.Click_Quiz_2_Ques_1();
		videopage.clickNextbutton_For_all_Page();
		Thread.sleep(1000);
		quiz_1.Click_Quiz_2_Ques_2();
		quiz_1.Click_Quiz_1_SubmitButton();
		Thread.sleep(2000);
		quiz_1.Click_Quiz_1_BackToCourseButton();	
	}
}
