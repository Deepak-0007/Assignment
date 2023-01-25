class nestedifexample
{
    public static void main(String args[])
    {
        int num=65;
    if (num>33)
         {
            if (num<50){
                System.out.println("grade a");

            }
            else if(num<70)
        {
            System.out.println("grade b");
    }
    else {
        System.out.println("grade c");
    }
         }
         else{
            System.out.println("fail");
         }
    }
}