//not inheritable
   class x4{
       private  void pro(){
      System.out.println("hello");
        }
    }
    
    public class F extends x4{
        public static void main(String[] args) {
            F x=new F();
            x.pro();
        }
    
      //  void pro(){
     // System.out.println("hii");
    // }
}
/*
 * F.java:11: error: cannot find symbol
            x.pro();
             ^
  symbol:   method pro()
  location: variable x of type F
1 error
 */

