package com.qa.testLayer;

import com.qa.pageLayer.CourseVideoPage;
import com.qa.testBase.Testbase;
import com.qa.utility.SleepClass;

public class VideoHandlingTestPage extends Testbase
{
	public static void VideoHandlingOption() throws InterruptedException
	{
	
		CourseVideoPage videopage=new CourseVideoPage();
		videopage.clickPlayButton();
		Thread.sleep(1000);
		videopage.clickOnSpeedDotOnVideo();
		Thread.sleep(1000);
		videopage.clickPlaybackSpeedButton();
		Thread.sleep(1000);
		videopage.ChoosePlaySpeed();
	//	Thread.sleep(1000);
		//videopage.clickPlayButton();
		String getvideoTime = videopage.getVideoTime();
		
		String timeAfterSlash=SleepClass.getTimeAfterSlash(getvideoTime);

		String timeBeforeSlash=SleepClass.getTimeBeforeSlash(getvideoTime);
		// Now convert this time to seconds
		 int totalSeconds = SleepClass.convertToSeconds(timeAfterSlash);
		
		// Now you can send this time to another method
	//	SleepClass.sleepBySpecificTime(totalSeconds);

	}
	
	
}
