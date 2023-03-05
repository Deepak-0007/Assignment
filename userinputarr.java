package array;
import java.util.Scanner;
import java.util.Arrays;
public class userinputarr {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String arr[]=new String[5];
	System.out.println("enter the number of array");
	//String n=sc.nextLine();
	for (int i=0;i<6-1;i++) {
		arr[i]=sc.nextLine();
		
	}
	for (int i=0;i<6-1;i++)
	System.out.println(arr[i]);
}
}
