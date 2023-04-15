package com.utilities;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FixedDepositCalculator {


	public static void main(String[] args) throws IOException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html?classic=true");
		String file= System.getProperty("user.dir") + "\\TestData\\caldata.xlsx";
		
		int rows= ExcelUtils.getRowCount(file, "Sheet1");
		for(int i=1; i<=rows; i++) {
			
			// Read Data from Excel
			
			String principle= ExcelUtils.getCellData(file, "Sheet1", i, 0);
			String rateofinterest= ExcelUtils.getCellData(file, "Sheet1", i, 1);
			String period1= ExcelUtils.getCellData(file, "Sheet1", i, 2);
			String period2= ExcelUtils.getCellData(file, "Sheet1", i, 3);
			String frequency= ExcelUtils.getCellData(file, "Sheet1", i, 4);
			String expmatvalue= ExcelUtils.getCellData(file, "Sheet1", i, 5);
			
			// Pass the Data to the Application
			
			driver.findElement(By.id("principal")).sendKeys(principle);

			
			
		}
	}

}
