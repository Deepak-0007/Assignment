import java.util.Scanner;
class method2
{
    public static void armstome(int num){
    int sum=0;
   
    while(num>0){
        int digit=num%10;
        sum =sum+(digit*digit*digit);
        num=num/10;
    }
    if(num==sum){
    System.out.print("armstrong number");
     }
    else{
        System.out.print("not armstrong number");
    }
    }
    public static void main(String args[]){
        
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the number");
       int num=sc.nextInt();
       armstome(num);

    } 
}