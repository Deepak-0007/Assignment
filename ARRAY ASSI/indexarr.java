package array;                //package name
import java.util.Scanner;     // Scanner class
public class indexarr {       // class name 
public static void main(String[] args) {  // main method
	Scanner sc=new Scanner(System.in);      // for user input
	System.out.println("enter the element of array");   // enter number of element
	int n =sc.nextInt();                           // user input number
	int arr[]=new int[n];              //array declare
	for(int i=0; i<n; i++) {          // loop
		arr[i]=sc.nextInt();          // element of array
	}
	for(int i=0;i<n;i++)            // loop for printing array
		System.out.print(arr[i]+" "); // prrint array
	System.out.println();    // print for next line
	System.out.println("enter the the number which you find index"); //enter number whom to find index
	int index=sc.nextInt(); //for input
	for(int i=0; i<arr.length;i++) { // loop for array length
		if(arr[i]==index) {      //condition of array index
			System.out.println("index of the array: "+i);  //print array of index
		}
	}
}
}
