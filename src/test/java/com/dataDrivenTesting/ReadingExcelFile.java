package com.dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

// File--->WorkBook--->Sheets--->Rows--->Cells

public class ReadingExcelFile {

	public static void main(String[] args) throws IOException {
// To Read the Data from the Excel File a special class is there i,e. 
		// FileInputStream
		// We need to create an instance for that class
		// FileInputStream file = new
		// FileInputStream("C:\\Venkatesh_Workspace\\seleniumWithJava\\TestData\\Bandari
		// Venkatesh-Tasksheet.xlsx");

		/*
		 * Here the FileInputStream will catch the location of the Excel file and refer
		 * the excel with name "file" This type of file path works with the Current
		 * Project only, Suppose if we moved to other project then it will not works To
		 * access the file in any Project we need to change the syntax
		 */
// 	To Access the file in any project the syntax is
		FileInputStream file1 = new FileInputStream(
				System.getProperty("user.dir") + "\\TestData\\Data_Driven_Testing_Excel_Venky.xlsx");

		// WorkBook
//To handle the Workbook of particular file
// we need to use another class
		// XSSFWorkbook, create an instance for this class
		XSSFWorkbook workBook = new XSSFWorkbook(file1);
		XSSFSheet sheet = workBook.getSheet("sheet1");
		int totalRows = sheet.getLastRowNum();
		int totalCells = sheet.getRow(1).getLastCellNum();

		System.out.println("The Total Number of Rows: " + totalRows);
		System.out.println("The Total Number of Cells: " + totalCells);

		for (int row = 0; row <= totalRows; row++) {

			XSSFRow currentRow = sheet.getRow(row);

			for (int cell = 0; cell < totalCells; cell++) {
				XSSFCell currentCell = currentRow.getCell(cell);
				String data = currentCell.toString();
				System.out.print(data + "      ");

			}
			System.out.println();
		}
		workBook.close();
		file1.close();

	}

}
