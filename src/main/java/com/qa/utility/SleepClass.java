package com.qa.utility;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import com.qa.pageLayer.CourseVideoPage;
import com.qa.testBase.Testbase;

public class SleepClass extends Testbase
{
	CourseVideoPage videopage=new CourseVideoPage(); 
	public static void sleepBySpecificTime(int usertime) throws InterruptedException
	{
		long sleeptime=(usertime +2);
		System.out.println("SYstem sleep for "+ usertime + " seconds! ...........");
		
		
		
		for (int i=1; i<= sleeptime; i++)
		{
			Thread.sleep(1000);
			System.out.println("Time left --> "+ (sleeptime-i) + " seconds ");
		}
		 System.out.println("Woke up after"+ usertime + " seconds!");
	}

	// Method to convert time in "mm:ss" format to total seconds
	public static int convertToSeconds(String time) {
	    // Split the time by ":"
	    String[] timeComponents = time.split(":");
	    
	    // Get the minutes and seconds
	    int minutes = Integer.parseInt(timeComponents[0]);
	    int seconds = Integer.parseInt(timeComponents[1]);
	    
	    int totalTimeInSeconds=minutes * 60 +seconds;
	    if(totalTimeInSeconds%2==0)
	    {
	    	return totalTimeInSeconds/2;
	    }
	    else
	    {
	    	return (totalTimeInSeconds+1)/2;
	    }
	    	
	}
	

	// Method to extract the time after the "/"
	public static String getTimeAfterSlash(String getvideoTime) {
	    // Split the string by " / " (a space followed by "/")
	    String[] timeParts = getvideoTime.split(" / ");
	    
	    // Check if the string is in the correct format
	    if (timeParts.length >= 2) {
	        // Extract the time after the "/"
	        return timeParts[1]; // This will be "11:01"
	    } else {
	        // If the string is not in the expected format, return null or throw an exception
	        System.out.println("Invalid time format");
	        return null;
	    }
	}
	
	// Method to extract the time Before the "/"
		public static String getTimeBeforeSlash(String getvideoTime) {
		    // Split the string by " / " (a space followed by "/")
		    String[] timeParts = getvideoTime.split(" / ");
		    
		    // Check if the string is in the correct format
		    if (timeParts.length >= 2) {
		        // Extract the time after the "/"
		        return timeParts[0]; // This will be "11:01"
		    } else {
		        // If the string is not in the expected format, return null or throw an exception
		        System.out.println("Invalid time format");
		        return null;
		    }
		}
		
		
		public  LinkedHashMap<String, Integer> getBeforeAfterVideoTime()
		{ 
			LinkedHashMap<String, Integer> timedetails=new LinkedHashMap<String, Integer>();
			String getvideoTime = videopage.getVideoTime();
			String afterVideoTime = getTimeAfterSlash(getvideoTime);
			String beforeVideoTime = getTimeBeforeSlash(getvideoTime);
			int totalSecondsBefore = convertToSeconds(beforeVideoTime);
			int totalSecondsAfter = convertToSeconds(afterVideoTime);
			timedetails.put("TimeCompletedOnVideo",  totalSecondsBefore);
			timedetails.put("TotalVideoTime",  totalSecondsAfter);
			return timedetails;
		}
}
