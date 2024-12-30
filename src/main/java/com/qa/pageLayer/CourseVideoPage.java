package com.qa.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.testBase.Testbase;

public class CourseVideoPage extends Testbase
{
	public CourseVideoPage()
	{
		PageFactory.initElements(driver, this);
	}

  @FindBy(xpath = "//button[@class='shaka-small-play-button material-icons-round shaka-tooltip']")
  private WebElement playbutton;
  public void clickPlayButton()
  {
	  playbutton.click();
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
		return VideoTime.getText();
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

