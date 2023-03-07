package array;

public class duplicateelement {
	public static void main(String[] args) {
		int arr[]= {2,3,4,5,2,9,0,3,5};
		for(int i=0;i<arr.length;i++) { // array initialize 
			for(int j=i+1;j<arr.length;j++) {
				if (arr[i]==arr[j] ){ // duplicate element save in arr[j]
					System.out.print(arr[j]+" "); // print duplicate element 
				}
			}
		}
		System.out.println("These are the duplicate element in the array ");
	}

}
