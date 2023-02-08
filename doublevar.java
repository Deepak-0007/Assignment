package assignment;

import java.util.Scanner;

public class doublevar {
	public static void main(String[] args) {
		double num1=0;
		double num2=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first number");
		num1=sc.nextDouble();
		System.out.println("enter the second number");
		num2=sc.nextDouble();
		if (num1>0 && num1<1 || num2<0 && num2>0) {
			System.out.println("True");
		}
		else { 
		System.out.println("false");
		}
			}
}
		
		
	


