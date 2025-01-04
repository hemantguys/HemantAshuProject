package com.qa.pageLayer;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.testBase.Testbase;

public class CourseVideoPage extends Testbase
{
	public CourseVideoPage()
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[@class='shaka-small-play-button material-icons-round shaka-tooltip']")
	private WebElement playButtonText;

	public String getPlayButtonText()
	{
		return playButtonText.getText();
	}
  @FindBy(xpath = "//button[text()='play_arrow']")
  private WebElement playbutton;

  public void clickPlayButton()
  {
	  playButtonText.click();
  }
	public boolean checkVideoPlayButtonDisplayed()
	{
		boolean playbuttondisplayed=playbutton.isDisplayed();
		return playbuttondisplayed;
	}

	@FindBy(xpath = "//button[text()='pause']")
	private WebElement pauseButton;
	public boolean checkPauseVideoButtonDisplayed()
	{
		boolean pausebuttondisplayed=pauseButton.isDisplayed();
		return pausebuttondisplayed;
	}

	public void clickPauseButton()
	{
		pauseButton.click();
	}
	@FindBy(xpath = "//button[text()='replay']")
	private WebElement replayButton;
	public boolean checkReplayVideoButtonDisplayed()
	{
		boolean replayButtondisplayed=replayButton.isDisplayed();
		return replayButtondisplayed;
	}

	public void clickReplayButton()
	{
		replayButton.click();
	}
	
	@FindBy(xpath  ="//button[@class='shaka-overflow-menu-button shaka-no-propagation material-icons-round shaka-tooltip']")
	private WebElement speeddotsonVideo;
	
	public void clickOnSpeedDotOnVideo()
	{
		speeddotsonVideo.click();
	}

	@FindBy(xpath = "(//span[@class='shaka-current-selection-span'])[3]")
	private WebElement PlaybackSpeedButton;
	
	public void clickPlaybackSpeedButton()
	{
		PlaybackSpeedButton.click();
	}
	
	@FindBy(xpath = "//button[span/text()='2x']")
	private WebElement PlaySpeedbutton;
	public void ChoosePlaySpeed()
	{
		PlaySpeedbutton.click();
	}
	
	
	
	
	@FindBy(xpath = "//button[@class='shaka-current-time']")
	private WebElement VideoTime;
	public String getVideoTime()
	{
		 try {
		        // Move to the element (if it's visible)
		        Actions act = new Actions(driver);
		        act.moveToElement(VideoTime).build().perform();

		        // Wait for the element to be visible
		        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		        wait.until(ExpectedConditions.visibilityOf(VideoTime));

		        // Return the text of the element
		        return VideoTime.getText();
		    } catch (Exception e) {
		        // Handle the case where the element is not displayed
		        System.out.println("VideoTime element is not displayed or not accessible.");
		        return "Element not displayed";
		    }
	}
	
	
	
	@FindBy(xpath = "(//span[@class='ms-Button-flexContainer flexContainer-80'])[5]")
	private WebElement NextbuttonAfterVideoComplete;
	public void clickNextButtonAfterVideoComplete()
	{
		NextbuttonAfterVideoComplete.click();
	}
	
	
	@FindBy(xpath = "(//button[@class='ms-Button ms-Button--primary root-183'])[2]")
	private WebElement Nextbutton_Documentpage_Session_1;
	public void clickNextbutton_Documentpage_Session_1()
	{
		Nextbutton_Documentpage_Session_1.click();
	}
	
	
	@FindBy(xpath = "//button[@name='Next']")
	private WebElement Nextbutton_For_all_Page;
	public void clickNextbutton_For_all_Page()
	{
		Nextbutton_For_all_Page.click();
	}
	
	public boolean CheckIsLessionLocked()
	{
		boolean b;
		// Define the locator for the element you want to check
        By locator = By.xpath("//p[text()='This lesson is locked']"); // Replace with your element's locator

        // Check if the element is present
        List<WebElement> elements = driver.findElements(locator);

        if (elements.size() > 0) {
            System.out.println("Session is locked.");
            b=true;
            // Perform your automation task when the element is present
        } else {
            System.out.println("Session is not locked.");
            // Perform your automation task when the element is absent
            b=false;
        }
		return b;
		
	}
	
	@FindBy(xpath = "//button[@name='Previous']")
	private WebElement Previousbutton_For_all_Page;
	public void clickPreviousbutton_For_all_Page()
	{
		Previousbutton_For_all_Page.click();
	}
	
	@FindBy(xpath = "//button[@data-automation-id='play-next-button' and @name='Next']")
	private WebElement Nextbutton_For_all_PageforQuiz5;
	public void clickNextbutton_For_all_PageforQuiz5()
	{
		Nextbutton_For_all_PageforQuiz5.click();
	}
	
	@FindBy(xpath = "//a[text()='Start Test']")
	private WebElement Start_test_session_1;
	public void clickStart_test_session_1()
	{
		Start_test_session_1.click();
	}
}

