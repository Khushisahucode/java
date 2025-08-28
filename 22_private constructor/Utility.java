
//utility class 
 class g1 {
   private g1() {

   }
   static void pro(){
    System.out.println("hello");
   }
   static void show(){
    System.out.println("namaste");
   }
   static int x=34;
   static int y=12;
   static int z=111;
}
public class Utility{
  public static void main(String[] args) {
      g1.show();
      g1.pro();
      System.out.println("value of x is : "+g1.x);
      System.out.println("value of y is : "+g1.y);
      System.out.println("value of z is : "+g1.z);

     
  
    }
}
