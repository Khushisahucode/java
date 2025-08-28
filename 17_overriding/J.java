
    
    class x5{
     static   void pro(){
      System.out.println("hello");
        }
    }
    
    public class J extends x5{
        public static void main(String[] args) {
            J x=new J();
            x.pro();
        }
        void  pro(){
           System.out.println("hii");
        }
}
/*
 * J.java:14: error: pro() in J cannot override pro() in x5
        void  pro(){
              ^
  overridden method is static
1 error
 */
