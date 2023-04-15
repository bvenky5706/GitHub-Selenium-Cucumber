package com.exceptionHandling;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// Exception : It is an Event that interrupts the normal work flow of the Program.
// Arithmetic Exception : whenever we do some impossible arithmetic tasks thenArithmetic Exception Arises.

public class ArithmeticException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		System.out.println(driver.getTitle());

		/*
		 * int firstNumber= 3; int secondNumber= 0; int result= 0; result = firstNumber
		 * / secondNumber ; System.out.println("Output is: "+ result);
		 */

	}

}
