package deepak;
public class aggrigation { // class name
        int Sr_no;
        String name;
        Address address;  // refrence class name 
    public aggrigation(int Sr_no,String name, Address address){ //parameter cont...
        this.Sr_no=Sr_no;
        this.name=name;
        this.address=address;
    }
    void display(){ // method name
        System.out.println(Sr_no+" "+name);  //s.o.p for print serial no and name
        System.out.println(address.city+" "+address.state+ " "+address.country);// address details
    }
    public static void main(String args[]){ //main method
        Address address1=new Address("bahadugarh","haryana","India"); // address1 
        Address address2=new Address("New delhi","Delhi","India");// address2
        aggrigation s=new aggrigation(1,"Deepak",address1);// print details
        aggrigation s1=new aggrigation(2,"Ajay",address2);// print 2 details
        s.display();// method calling 
        s1.display();// method calling

    }
    
}
