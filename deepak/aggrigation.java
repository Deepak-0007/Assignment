package deepak;
public class aggrigation {
            int Sr_no;
        String name;
        Address address;
    public aggrigation(int Sr_no,String name, Address address){
        this.Sr_no=Sr_no;
        this.name=name;
        this.address=address;
    }
    void display(){
        System.out.println(Sr_no+" "+name);
        System.out.println(address.city+" "+address.state+ " "+address.country);
    }
    public static void main(String args[]){
        Address address1=new Address("bahadugarh","haryana","India");
        Address address2=new Address("New delhi","Delhi","India");
        aggrigation s=new aggrigation(1,"Deepak",address1);
        aggrigation s1=new aggrigation(2,"Ajay",address2);
        s.display();
        s1.display();

    }
    
}
