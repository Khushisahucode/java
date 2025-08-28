
    class x11{
     public  void pro(){
       System.out.println("hello");
         }
     }
     
     public class F3 extends x11{
         public static void main(String[] args) {
             F3 x=new F3();
             x.pro();
         }
          protected void pro(){
           System.out.println("hii");
        }
}
/*
 * F3.java:13: error: pro() in F3 cannot override pro() in x11
          protected void pro(){
                         ^
  attempting to assign weaker access privileges; was public
1 error

 */


