package array;
import java.util.Scanner;
public class arrayevenodd {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int odd_count = 0,even_count=0;
		System.out.println("enter the size of arrya");
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++) {
			System.out.print(arr[i]+" ");
			System.out.println();
			if(arr[i]%2==0) 
				even_count++;
			else
			odd_count++;
		}
		System.out.println("no of even in array " + even_count);
		System.out.println("no of odd in array " +odd_count);
	}

}
