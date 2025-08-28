// Dynamic  method  dispatch 
//runtime polymosphism
class z1{
    void pro(){
        System.out.println("hii");
    }
}

public class runtime  extends z1{
   public static void main(String[] args) {
   z1 x=new runtime();
   x.pro();
   } 
   void pro(){
    System.out.println("hello");
   }
}
/*
 * hello

 */