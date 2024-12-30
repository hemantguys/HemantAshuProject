package com.qa.testLayer;

import com.qa.pageLayer.CourseVideoPage;
import com.qa.pageLayer.Quiz_1_Page;
import com.qa.testBase.Testbase;
import com.qa.utility.SleepClass;

public class Quiz6 extends Testbase
{
	public void Quiz_6_test_fun() throws InterruptedException 
	{
		Quiz_1_Page quiz_1=new Quiz_1_Page();
		CourseVideoPage videopage=new CourseVideoPage();
		SleepClass sleepClass=new SleepClass(); //1
		System.out.println("Session started for Part 6");
		VideoHandlingTestPage handlingTestPage=new VideoHandlingTestPage();
		handlingTestPage.VideoHandlingOption();
		Thread.sleep(1000);
		String getvideoTime = videopage.getVideoTime();
		
		String afterVideoTime = sleepClass.getTimeAfterSlash(getvideoTime);
		String beforeVideoTime = sleepClass.getTimeBeforeSlash(getvideoTime);
		int totalSecondsBefore = SleepClass.convertToSeconds(beforeVideoTime);
		int totalSecondsAfter = SleepClass.convertToSeconds(afterVideoTime)+2;
		int i=totalSecondsAfter-totalSecondsBefore;
		while(totalSecondsAfter>totalSecondsBefore)
		{	
			Thread.sleep(1000);
			if(i%5==0)
			{
				System.out.println("Waiting " + (i)+" seconds more to start next task ");
			} 
			i-=1;
			totalSecondsBefore+=1;
		}
		Thread.sleep(3000);
		videopage.clickNextbutton_For_all_Page();
		Thread.sleep(1000);
		videopage.clickPreviousbutton_For_all_Page();
		Thread.sleep(1000);
		videopage.clickNextbutton_For_all_Page();
		Thread.sleep(1000);
		videopage.clickNextbutton_For_all_Page();
		Thread.sleep(1000);
		videopage.clickPreviousbutton_For_all_Page();
		Thread.sleep(1000);
		videopage.clickNextbutton_For_all_Page();
		Thread.sleep(1000);
		videopage.clickNextbutton_For_all_Page();
		Thread.sleep(1000);
		videopage.clickPreviousbutton_For_all_Page();
		Thread.sleep(1000);
		videopage.clickNextbutton_For_all_Page();
		Thread.sleep(2000);
		videopage.clickStart_test_session_1();
		System.out.println("Session started to Quiz 6");
		
		//Quiz 6
		Thread.sleep(1000);
		Quiz_1_Page.Get_Input_AndClick_Quiz_Option("All of  the above ");
		videopage.clickNextbutton_For_all_Page();
		Thread.sleep(1000);
		quiz_1.Get_Input_AndClick_Quiz_Option("Find");
		quiz_1.Click_Quiz_1_SubmitButton();
		Thread.sleep(2000);
		quiz_1.Click_Quiz_1_BackToCourseButton();	
	}
}
