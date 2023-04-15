package com.dataDrivenTesting;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//File--->WorkBook--->Sheets--->Rows--->Cells

public class WritingDataIntoExcelFile {

	public static void main(String[] args) throws IOException {
		// To Write the Data into the Excel File a special class is there i,e.
		// FileOutputStream
		// We need to create an instance for that class
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir") + "\\TestData\\WritingFile.xlsx");

		// Create New WorkBook
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet();

// Creating Rows, Cells writing and updating the Data into Excel without loop.

		/*
		 * XSSFRow row1= sheet.createRow(0);
		 * 
		 * row1.createCell(0).setCellValue("Padmanabam");
		 * row1.createCell(1).setCellValue("Lakshmi");
		 * row1.createCell(2).setCellValue("Venkatesh");
		 * row1.createCell(3).setCellValue("Anuradha");
		 * 
		 * 
		 * XSSFRow row2= sheet.createRow(1);
		 * 
		 * 
		 * row2.createCell(0).setCellValue("Vasudev");
		 * row2.createCell(1).setCellValue("Prasanna");
		 * row2.createCell(2).setCellValue("Krishna");
		 * row2.createCell(3).setCellValue("Bbhanu");
		 * 
		 * This approach will takes lot of code in order to reduse the code complexity
		 * we use loop and to enter the text from user we use scanner class
		 */

		Scanner scanner = new Scanner(System.in);

		for (int row = 0; row <= 3; row++) {
			XSSFRow currentrow = sheet.createRow(row);

			for (int c = 0; c < 2; c++) {
				// XSSFCell cell= currentrow.createCell(c);
				System.out.println("Enter a Value: ");
				String value = scanner.next();
				// cell.create
				currentrow.createCell(c).setCellValue(value);
			}
		}

		workbook.write(file);
		workbook.close();
		file.close();

		System.out.println("Writing is done!!!");

	}

}
