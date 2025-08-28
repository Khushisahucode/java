
    class x9{
        private  void pro(){
       System.out.println("hello");
         }
     }
     
     public class F1 extends x9{
         public static void main(String[] args) {
             F1 x=new F1();
             x.pro();
         }
        protected void pro(){
           System.out.println("hii");
        }
}
