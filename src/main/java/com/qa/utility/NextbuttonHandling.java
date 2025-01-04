package com.qa.utility;

import com.qa.pageLayer.CourseVideoPage;
import com.qa.testBase.Testbase;

public class NextbuttonHandling extends Testbase
{
	CourseVideoPage videopage=new CourseVideoPage();
	public void handleNextButtonIfMaduleLocked() throws InterruptedException
	{
		videopage.clickNextbutton_For_all_Page();
		boolean b=videopage.CheckIsLessionLocked();
		while(b)
		{
			Thread.sleep(1000);
			videopage.clickPreviousbutton_For_all_Page();
			Thread.sleep(1000);
			videopage.clickNextbutton_For_all_Page();
			Thread.sleep(1000);
		    b=videopage.CheckIsLessionLocked();
		}
	}

}
