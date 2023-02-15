class DisplayMessage{
  void printMessage(){
   System.out.println("Hello My Message");
}
}    
class  MyProgram extends DisplayMessage 
  {
    public static void main(String args[]){
      MyProgram program=new MyProgram();
      program.printMessage();
   }
}

