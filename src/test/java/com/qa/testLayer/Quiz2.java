package com.qa.testLayer;

import java.util.LinkedHashMap;

import com.qa.pageLayer.CourseVideoPage;
import com.qa.pageLayer.Quiz_1_Page;
import com.qa.testBase.Testbase;
import com.qa.utility.NextbuttonHandling;
import com.qa.utility.SleepClass;

public class Quiz2 extends Testbase
{
	public  void Quiz_2_test_fun() throws InterruptedException
	{
		Quiz_1_Page quiz_1=new Quiz_1_Page();
		CourseVideoPage videopage=new CourseVideoPage();
		NextbuttonHandling handling=new NextbuttonHandling();
		System.out.println("---------------------Session 2 started ----------------------");
		SleepClass sleepClass=new SleepClass(); //1
		VideoHandlingTestPage handlingTestPage=new VideoHandlingTestPage();
		handlingTestPage.VideoHandlingOption();
		Thread.sleep(2000);
		LinkedHashMap<String, Integer> timedetails=new LinkedHashMap<String, Integer>();
		timedetails=sleepClass.getBeforeAfterVideoTime();
		int totalSecondsAfter=timedetails.get("TotalVideoTime");
		int totalSecondsBefore=timedetails.get("TimeCompletedOnVideo");
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
			if(totalSecondsBefore%15==0)
			{
				timedetails=sleepClass.getBeforeAfterVideoTime();
				totalSecondsAfter=timedetails.get("TotalVideoTime");
				totalSecondsBefore=timedetails.get("TimeCompletedOnVideo");
				System.out.println("...............Waiting time updated........ ");
			}
		}
	/*	Thread.sleep(2000);
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
		Thread.sleep(1000);
		videopage.clickStart_test_session_1();  */
		Thread.sleep(2000);
		System.out.println("Video Completed");
		handling.handleNextButtonIfMaduleLocked();
		System.out.println("Document 1 Started");
		handling.handleNextButtonIfMaduleLocked();
		System.out.println("Document 1 Completed");
		handling.handleNextButtonIfMaduleLocked();
		Thread.sleep(1000);
		videopage.clickStart_test_session_1(); 
		System.out.println("Quiz 2 Started");
		
		//Quiz 2
		Thread.sleep(1000);
		quiz_1.Click_Quiz_2_Ques_1();
		videopage.clickNextbutton_For_all_Page();
		System.out.println("Question 1 attempted succssefuly ");
		Thread.sleep(2000);
		Quiz_1_Page.Get_Input_AndClick_Quiz_Option("Save a document");
		quiz_1.Click_Quiz_1_SubmitButton();
		System.out.println("Question 2 attempted succssefuly ");
		
		Thread.sleep(2000);
		quiz_1.Click_Quiz_1_BackToCourseButton();	
		System.out.println("Quiz 2 Completed successfully");
		System.out.println("----------------Session 2 Completed successfully---------------------");
		
	}

}
