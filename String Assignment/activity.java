public class activity {
    public static void main(String[] args) {
        String str="welcome to java world";  // first question
        System.out.println("String to the print "+str);// print string
        char ch=str.charAt(4); // question 1 part 2
        System.out.println("character at 5th postion : "+ch);// print 5th postion of string
        String str1="Welcome"; // question 1 part 3
        System.out.println("Second string is "+str1);// print second string
        int camparsion=str.compareToIgnoreCase(str1); // question 1 part 4 
        System.out.println("camparsion "+camparsion); // 
        String strconcat=str.concat("-let us learn"); // question 1 part 5
        System.out.println("after concatenate : " +strconcat); // after concatenate
        int pos=str.indexOf('a');//question 1 part 6
        System.out.println("postion of frist occurence of a "+pos);// find the position of char
        String strrepalce=str.replace('a','e'); // question 1 part 7
        System.out.println("after replace: "+strrepalce); // to repalce the char
        String strsub=str.substring(4, 10);//question 1 part 8
        System.out.println("string between 4th to 10th postion: "+strsub); // written the string with given position
        String strlowercase=str.toLowerCase();//question 1 part 9
        System.out.println("Lowercase of string: "+strlowercase);// write the string in lowercase

    }
    
}
