public class activity2 {
   public static void main(String[] args) {
    StringBuffer s=new StringBuffer("this is StringBuffer");
    s.append(" this is simple program");
    System.out.println("after append "+s);
    s.insert(21,"Object");
    System.out.println("after insert "+s);
    s.replace(14,18,"Builder");
    System.out.println("after the replace " +s);
    s.reverse();
    System.out.println("after the reverse " +s.reverse());
   } 
}
