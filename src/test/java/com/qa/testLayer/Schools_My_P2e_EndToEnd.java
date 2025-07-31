package com.qa.testLayer;

import org.testng.annotations.Test;
import com.qa.pageLayer.*;
import com.qa.testBase.Testbase;
import com.qa.utility.ReadWritefromExcel2;
import java.util.Map;

public class Schools_My_P2e_EndToEnd extends Testbase
{
	@Test(dataProvider = "loginData", dataProviderClass = ReadWritefromExcel2.class)
	public void e2e_main_test(Map<String, String> loginData, int rowNumber) throws InterruptedException {
	    String username = loginData.get("Username");
	    String password = loginData.get("Password");
		System.out.println("Scenario processing for Row Number " + rowNumber);

	    // Initialize page objects
	    HomeTestPage homeTestPage = new HomeTestPage();
	    LoginTestPage loginTestPage = new LoginTestPage();
	    Quiz1 quiz1 = new Quiz1();
	    Quiz2 quiz2 = new Quiz2();
	    Quiz3 quiz3 = new Quiz3();
	    Quiz4 quiz4 = new Quiz4();
	    Quiz5 quiz5 = new Quiz5();
	    Quiz6 quiz6 = new Quiz6();
	    Quiz7 quiz7 = new Quiz7();
	    Quiz8 quiz8 = new Quiz8();
	    FinalQuizpage finalQuizpage = new FinalQuizpage();

	    // Execute test steps
	    homeTestPage.HomePage_fun();
	    loginTestPage.UserLogin(username, password);
	    homeTestPage.HomePageCourseLibLink_Fun();
	    quiz1.Quiz_1_test_fun();
	    quiz2.Quiz_2_test_fun();
	    quiz3.Quiz_3_test_fun();
	    quiz4.Quiz_4_test_fun();
	    quiz5.Quiz_5_test_fun();
	    quiz6.Quiz_6_test_fun();
	    quiz7.Quiz_7_test_fun();
	    quiz8.Quiz_8_test_fun();
	    finalQuizpage.Final_Summary_Page();
	    finalQuizpage.Final_Quiz();
		System.out.println("Hemant");
	    // Write "Completed" status to the Excel sheet
	    String sheetName = "Sheet1";  // Define the sheet name (make it configurable if needed)
	    int rowNo = -1;

	    try {
	        if (loginData.containsKey("RowNumber")) {
	            rowNo = Integer.parseInt(loginData.get("RowNumber"));
	        }
	    } catch (NumberFormatException e) {
	        System.out.println("RowNumber not found or invalid in data, skipping status write.");
	    }

	    if (rowNo != -1) {
	        ReadWritefromExcel2.writeTestStatus(sheetName, rowNo, "Status", "Completed");
			ReadWritefromExcel2.writeTestStatus(sheetName, rowNo, "Flag", "N");
	    }
	}
}
