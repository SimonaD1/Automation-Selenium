package com.worldillustrated.utils;

import java.util.Hashtable;



public class TestDataProvider 
{
/*************To the data for test case*********************/
	
	public static Object[][] getTestData(String dataFileName, String SheetName, String TestName)
	{
		ReadExcelDataFile readdata = new ReadExcelDataFile(System.getProperty("user.dir") + "\\src\\test\\TestData\\" + dataFileName);
		String sheetName = SheetName;
		String testName = TestName;
		
		
		//Find start row of test case
		int startRowNum = 0;
		
		while(!readdata.getCellData(sheetName,0,startRowNum).equalsIgnoreCase(testName))
		{
			startRowNum++;
			
		}
		
		int startTestCol = startRowNum + 1;
		int startTestRow = startRowNum + 2;
		
		//Find Number Of Rows in Test Case
		int rows = 0;
		while(!readdata.getCellData(sheetName, 0, startTestRow+rows).equals(""))
		{
			rows++;
		}
		
		//Find total Number of Cols in testCase
		int colmns = 0;
		while(!readdata.getCellData(sheetName, colmns, startTestCol).equals(""))
		{
			colmns++;
		}

		
		//Difine Two Object Array
		Object [][] dataSet = new Object[rows][1];
		
		Hashtable<String,String> dataTable = null;
		
		int dataRowNumber = 0;
		
		for(int rowNumber = startTestRow; rowNumber < startTestRow + rows; rowNumber++)
		{
			dataTable = new Hashtable<String, String>();
			for(int colNumber = 0; colNumber < colmns; colNumber++)
			{
				String key = readdata.getCellData(sheetName, colNumber, startTestCol);
				String value = readdata.getCellData(sheetName, colNumber, rowNumber );
				//dataSet[dataRowNumber][colNumber] = readdata.getCellData(sheetName, colNumber, rowNumber);
				//00,01,02,03
				//10//11//12
				dataTable.put(key, value);
			}
			dataSet[dataRowNumber][0] = dataTable;
			dataRowNumber++;
		}
		return dataSet;
	}

}
