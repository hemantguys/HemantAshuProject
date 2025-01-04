package com.qa.testLayer;

import com.qa.pageLayer.CourseVideoPage;
import com.qa.testBase.Testbase;
import com.qa.utility.SleepClass;

public class VideoHandlingTestPage extends Testbase
{
	static CourseVideoPage videopage=new CourseVideoPage();
	public static void VideoHandlingOption() throws InterruptedException
	{
	

		Thread.sleep(1000);
		//playbuttonlogic();
		videopage.clickPlayButton();
		videopage.clickOnSpeedDotOnVideo();
		Thread.sleep(1000);
		videopage.clickPlaybackSpeedButton();
		Thread.sleep(1000);
		videopage.ChoosePlaySpeed();
		Thread.sleep(1000);
		playbuttonlogic();
	/*	String getvideoTime = videopage.getVideoTime();
		
		String timeAfterSlash=SleepClass.getTimeAfterSlash(getvideoTime);

		String timeBeforeSlash=SleepClass.getTimeBeforeSlash(getvideoTime);
		// Now convert this time to seconds
		 int totalSeconds = SleepClass.convertToSeconds(timeAfterSlash);
		
		// Now you can send this time to another method
	//	SleepClass.sleepBySpecificTime(totalSeconds);
*/
	}

	public static void playbuttonlogic()
	{
		String text= videopage.getPlayButtonText();
	//	boolean playButtonDisplayed = videopage.checkVideoPlayButtonDisplayed();
	//	boolean pauseButtonDisplayed = videopage.checkPauseVideoButtonDisplayed();
	//	boolean replayButtonDisplayed = videopage.checkReplayVideoButtonDisplayed();

		if (text.equalsIgnoreCase("play_arrow"))
		{
			// If play button is displayed, click it to play the video
			videopage.clickPlayButton();
		}

	}
	
	
}
