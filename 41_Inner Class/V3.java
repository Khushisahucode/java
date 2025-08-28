interface p {
   void aaa();
}
public  class V3 {
      private int s=111;
        p x=new p(){
           public  void aaa(){
           System.out.println(s);
            }
          private void bbb(){
           System.out.println("hi.....");
            }
        };
         public static void main(String[] args) {
            V3 y=new V3();
            y.x.aaa();
            y.x.bbb();
        }
    }
// V3.java:17: error: cannot find symbol
//             y.x.bbb();
//                ^
//   symbol:   method bbb()
//   location: variable x of type p
// 1 error