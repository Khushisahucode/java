
    
    class x4{
         void pro(){
       System.out.println("hello");
         }
     }
     
     public class I extends x4{
         public static void main(String[] args) {
             I x=new I();
             x.pro();
         }
         int  pro(){
            System.out.println("hii");
         }
}
/*
 * I.java:14: error: pro() in I cannot override pro() in x4
         int  pro(){
              ^
  return type int is not compatible with void
1 error

 */
