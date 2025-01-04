package com.qa.testLayer;

import org.openqa.selenium.Alert;

import com.qa.pageLayer.CourseVideoPage;

import com.qa.pageLayer.Quiz_1_Page;
import com.qa.testBase.Testbase;
import com.qa.utility.FinalAssessment;
import com.qa.utility.NextbuttonHandling;


public class FinalQuizpage extends Testbase
{
	Quiz_1_Page quiz_1=new Quiz_1_Page();
	CourseVideoPage videopage=new CourseVideoPage();
	FinalAssessment assessment=new FinalAssessment();
	NextbuttonHandling handling = new NextbuttonHandling();
	public void Final_Summary_Page() throws InterruptedException
	{
		Thread.sleep(2000);
		handling.handleNextButtonIfMaduleLocked();
		Thread.sleep(1000);
		quiz_1.Click_StartGradedAssessmentButton();
	}
	public void Final_Quiz() throws InterruptedException
	{
		for(int i=1;i<=20;i++)
		{
			String question = quiz_1.Get_Quiz_Question();
			System.out.println("Question Number " + i);
			System.out.println(question);
			int correctOptinon=Integer.parseInt(assessment.GetCorrectOption(question));
			System.out.println("Correct Answer " + correctOptinon);
			Thread.sleep(2000);
			quiz_1.Get_Input_AndClick_Quiz_Option1(correctOptinon);
			Thread.sleep(1000);
			if(i<20)
			{
				quiz_1.Click_Quiz_1_NextButton();
			}
			else
			{
				quiz_1.Click_Quiz_1_SubmitButton();
			}
		}
		Thread.sleep(3000);
		quiz_1.Click_Quiz_1_BackToCourseButton();	
		quiz_1.ClickDownloadCertificateButton();

		quiz_1.ClickCloseAndExitAfterDownloadCertificateButton();
		quiz_1.ClickLogoutbuttonImage();
		Thread.sleep(1000);
		quiz_1.ClickLogoutButton();


	}
}
