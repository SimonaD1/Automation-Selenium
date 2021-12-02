package com.worldillustrated.TestCases;

import org.testng.annotations.Test;

import com.worldillustrated.BaseClasses.BaseUI;

public class SearchTests extends BaseUI 
{
	SearchActions action = new SearchActions();
	
	@Test
	public void Search_TC001()
	{   
		logger = report.createTest("Search_TC001");
		action.openApp();
		action.isElementPresent("search_input_field_xpath");
		action.closeApp();
	}
}
