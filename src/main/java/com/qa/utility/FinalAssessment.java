package com.qa.utility;

import com.qa.testBase.Testbase;

public class FinalAssessment extends Testbase
{
	public String GetCorrectOption(String question)
	{
		String option;
		switch (question) 
		{
		case "Which of the following cannot be done using a computer?":
			option="2";
			break;
		case "Which of the following statements is not true?":
			option="0";
			break;
			
		case "Autosum function in MS Excel calculates _______ of a given range of cells.":
			option="0";
			break;
		case "Header & Footer Option is found in which Tab?":
			option="1";
			break;
		case "Which menu provides you options like Animation Scheme, custom Animation, Slide Transition?":
			option="3";
			break;
		case "To keep several files in one place you create a ______________.":
			option="0";
			break;
		case "The extension of a PowerPoint file is":
			option="1";
			break;
		case "Formulae that is used in a cell to calculate a value is visible in":
			option="2";
			break;
		case "What happens if you select first and second slide and then click on New Slide button on toolbar?":
			option="1";
			break;
		case "Which of the following can be used to check emails?":
			option="3";
			break;
		case "In the title bar of MS Word we generally see the":
			option="0";
			break;
		case "In order to find an average of a given cell which function will be used.":
			option="1";
			break;
		case "In a PowerPoint slideshow we can insert":
			option="3";
			break;
		case "From where can you access the Save command ?":
			option="3";
			break;
		case "An application for making a video call through a smartphone is ___________":
			option="0";
			break;
		case "Extension of a saved MS Word file will be":
			option="1";
			break;
		case "Choose the benefit of making electronic payments of bills?":
			option="0";
			break;
		case "Which will be a best device to make a utility bill payment online.":
			option="1";
			break;
		case "MS Excel sheet resembles with a regular":
			option="1";
			break;
		case "MS Excel can be used to automate.":
			option="3";
			break;

		default:
			option="2";
			break;
		}
		return option;
	}
}
