public class student {
   public static void main(String[] args) {
     pen p1=new pen()  ;
     p1.write(); // HAS  Arelationship

   } 
    //Student----- HAS A-------pen 
}
class pen{
    void write(){
     System.out.print("i have pen");
    }
}
