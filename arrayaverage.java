package array;
import java.util.Scanner;
public class arrayaverage {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter the number of array in fill in array");
	int num=sc.nextInt();
	int arr[]=new int[num];
	int average=0;
	int sum=0;
	for(int i=0;i<num;i++) {
		arr[i]=sc.nextInt();
		sum=sum+arr[i];
		 average=sum/num;
	}
	//for(int i=0;i<num;i++)
	System.out.println("average" +average);
}
}
