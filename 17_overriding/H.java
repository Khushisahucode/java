
    class x7{
        abstract   void pro(){
         System.out.println("hello");
           }
       }
       
       public class H extends x7{
           public static void main(String[] args) {
               H x=new H();
               x.pro();
           }
          abstract void  pro(){
              System.out.println("hii");
           }
   }
   /*
    * H.java:2: error: x7 is not abstract and does not override abstract method pro() in x7
    class x7{
    ^
H.java:3: error: abstract methods cannot have a body
        abstract   void pro(){
                        ^
H.java:8: error: H is not abstract and does not override abstract method pro() in H
       public class H extends x7{
              ^
H.java:13: error: abstract methods cannot have a body
          abstract void  pro(){
                         ^
4 errors
    */
