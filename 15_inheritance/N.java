
    
    
class bb{
      void walk(){
         System.out.println("i can walk");
     }
 }
 class x2 extends bb {
   void talk (){
     System.out.println("i can talk");
   }
 }
 class xx extends x2{
   void laugh(){
     System.out.println("i can laugh");
   }
 }
 
 
 
 public class N extends xx {
     public static void main(String[]args){
         N m1=new N();
         m1.talk();
         m1.laugh();
         m1.walk();
     }
 }

