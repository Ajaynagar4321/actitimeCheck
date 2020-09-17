package com.actitime.test.actitime;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReportTest {

	@Test
	public void TestExtend() {
		ExtentReports report = new ExtentReports("./report/extend.html", false);
		ExtentTest test = report.startTest("functional testing");
		test.log(LogStatus.PASS, "test is pass");
		test.log(LogStatus.FAIL, "test is fail");
		test.log(LogStatus.SKIP, "test is Skip");
		report.endTest(test);
		report.flush();
	}

}
