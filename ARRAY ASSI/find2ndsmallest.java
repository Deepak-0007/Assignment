package array;
import java.io.*;
import java.util.*;
public class find2ndsmallest {
public static void main(String[] args) {
	int arr[]= {2,9,4,5,1};
	int n=arr.length;
	Arrays.sort(arr);
	System.out.println(" Second smallest element of the array"+arr[1]);
}
}
