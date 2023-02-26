package com;  // package name 
import java.util.Scanner;   // import java class 

class TaxCalculator {  // class name
	static float basicSalary,tax;  // varibale 
	static boolean citizenship;
	static int netSalary;
	
	static void calculateTax() {  // static mehtod

	tax=30*basicSalary/100;    // conditonal logic 
   System.out.println(" the salary"+basicSalary+"is" +tax);// basic salary and tax
	}
	static void deductTax() {
		netSalary=(int)(basicSalary-tax);
		System.out.println("net salary"+netSalary);
	}
	static void validateSalary() {
		boolean response=(basicSalary>100000 && citizenship==true);// basic logic for true and false
		if(response) {
			System.out.println("ctizenship eligibility"+response);
		             }
		else {
			System.out.println("salary and eligibilyr"+response);
	        }
      }
}
public class EmployeeTax{   // main class 
public static void main(String args[]) {   // main method 
	Scanner sc=new Scanner(System.in);   // Scanner class
	System.out.println("enter salary");     // input salary
	TaxCalculator.basicSalary=sc.nextFloat();   // method 
	System.out.println("citizenship(true if inside india otherwise false)");
	TaxCalculator.citizenship=sc.nextBoolean();  // boolean
	sc.close();    // close scanner class
	TaxCalculator.calculateTax();  // method calling  
	TaxCalculator.deductTax();  // method
	TaxCalculator.validateSalary();
}
}