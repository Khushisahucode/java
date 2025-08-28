interface p {
   void aaa();
}
public  class V4 {
      private int s=111;
        p x=new p(){
           public  void aaa(){
           System.out.println(s);
           bbb();
            }
          private void bbb(){
           System.out.println("hi.....");
            }
        };
         public static void main(String[] args) {
            V4 y=new V4();
            y.x.aaa();
           // y.x.bbb(); not ok
        }
    }
// 111
// hi.....