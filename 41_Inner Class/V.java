interface v1 {
   void aaa();
}
public class V implements  v1{
      public void aaa(){
         System.out.println("hi.....");
      }
    public static void main(String[] args) {
        v1 x=new V();
        x.aaa();

    }
}
//hii