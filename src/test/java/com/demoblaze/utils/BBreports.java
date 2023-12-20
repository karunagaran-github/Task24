package com.demoblaze.utils;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class BBreports {
			
		public static ExtentSparkReporter sparkReports;
		
		public static ExtentReports extentReports;
		
		public static ExtentTest extentTest;
		
		@BeforeSuite(alwaysRun=true)
		public void startReport()
		{
			try
			{
				sparkReports= new ExtentSparkReporter(System.getProperty("user.dir")+"/WebAutomationReport1.html");
				sparkReports.config().setReportName("bestbuy Automation Report");
				sparkReports.config().setDocumentTitle("Web Automation Report");

				extentReports= new ExtentReports();
				extentReports.attachReporter(sparkReports);


			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}

		@BeforeClass
		public void setTCDesc(String testcaseName)
		{
			try
			{
				extentTest=extentReports.createTest(testcaseName);


			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}

		public static void reportStep(String status, String desc)
		{
			if(status.toUpperCase().equals("PASS"))
			{
				extentTest.log(Status.PASS, desc);
			}
			else if(status.toUpperCase().equals("FAIL"))
			{
				extentTest.log(Status.FAIL, desc);
			}
			else if (status.toUpperCase().equals("INFO"))
			{
				extentTest.log(Status.INFO, desc);
			}
		}

		@AfterSuite(alwaysRun = true)
		public void endReport()
		{
			try
			{
				extentReports.flush();
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}


	}




