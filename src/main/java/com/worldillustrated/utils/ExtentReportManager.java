package com.worldillustrated.utils;

import com.aventstack.extentreports.ExtentReports;

import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.worldillustrated.utils.DateUtils;

public class ExtentReportManager 
{
	public static ExtentReports report;
	
	public static ExtentReports getReportInstance()
	{
		if(report == null)
		{
			String reportName = DateUtils.getTimeStamp() + ".html";
			ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") + "\\test-output\\" + reportName);
			report = new ExtentReports();
			report.attachReporter(htmlReporter);
			
			report.setSystemInfo("OS", "Windows 10");
			report.setSystemInfo("Enviroment", "UAT");
			report.setSystemInfo("Build Number", "10.8.1");
			report.setSystemInfo("Browser", "Chrome");
			
			
			htmlReporter.config().setDocumentTitle("UAT UI Automation results");
			htmlReporter.config().setReportName("All headlines UI test report");
			htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
			htmlReporter.config().setTimeStampFormat("MMM dd, yyyy  HH:mm:ss");



		}
		return report;
	}

}
