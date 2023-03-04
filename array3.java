package array; // package name 
import java.util.Scanner;                                  //import scanner class 
public class array3 {                                     // main class name 
	public static void main(String[] args) {             // main method
		Scanner sc=new Scanner(System.in);              // Scanner for systme input
     System.out.println("enter the number of array");  // print for input
     int num =sc.nextInt();                           // access for giving input of number
     int arr[]=new int [num];                        // array declartion
     int sum=0;                                     // for sum
     for(int i=0;i<num;i++) {                      // for intilaizaiton of array
    	 arr[i]=sc.nextInt();                     // input of array
    	
    	 sum=sum+arr[i];                        // for sum of the array 
     }
     for(int i=0;i<num;i++)                   // for given arrya print
     System.out.print(arr[i]+" ");           //print array 
     System.out.println();					// print for next linr
     System.out.println("sum"+sum);        // sum of the array
	}

}
