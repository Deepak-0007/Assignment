package array;

public class max {

	static void maximum(int array[]) {
		int max=array[0];
		for(int i=1;i<array.length;i++) {
			if (max<array[i])
				max=array[i];
			System.out.println(max);
		}
	}
	public static void main(String[] args) {
		int arr[]= {5,7,4};
				maximum(arr);
		
	}
}