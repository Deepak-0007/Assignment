package assignment;

import java.util.Scanner;

public class fact {
	public static void main(String[] args) {
		int num;
		int fact=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		num=sc.nextInt();
		for(int i=1;i<=num; i++) {
		fact=fact*i;
		}
		System.out.println("factorica " +fact);
		
	}

}
