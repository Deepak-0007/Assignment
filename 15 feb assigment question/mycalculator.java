package assignment;
import java.util.*;

class AdvancedAirthmetic{
    int divisorSum(){ // method with return type
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number:");
	    int num=sc.nextInt();
	    int sum = 0;
	    System.out.println("Total divisor are :");
	         for(int i = 1; i <= num; i++) {
	             if (num % i == 0) {
	         	 System.out.println(" "+i);
	                 sum = sum + i; 
	             }
	             
	         
	         }
	         System.out.println("The Sum Of The Divisors is: ");
	         System.out.println(sum);
	    return  divisorSum();  //calling method   
	}
	}

  public class mycalculator extends AdvancedAirthmetic {
	

	public static void main(String[] args) {
		AdvancedAirthmetic obj=new AdvancedAirthmetic();//oject of first class
		obj.divisorSum();                               // call the method by onject
		

	}

}