import java.util.Scanner;
class method1
{
    public static void prime(int num){
       // int count=0;
      
        for(int i =2; i<num; i++){
        if(num%i==0){
           System.out.print("Not prime number");
           break;
        }     
        else{
            System.out.print("prime number");
            break;
        }
        }

    }
    public static void main(String args[])
    {
    
        Scanner sc=new Scanner(System.in);
        int num =sc.nextInt();
        prime(num);
    }
}