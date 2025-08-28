interface n {
   void aaa();
}
public  class V2 {
      private int s=111;
        n x=new n(){
           public  void aaa(){  // anonymous inner class
           System.out.println(s);
            }
        };
         public static void main(String[] args) {
            V2 y=new V2();
            y.x.aaa();
        }
    }
