
    class x6{
        static   void show(){
         System.out.println("hello");
           }
       }
       
       public class K extends x6{
           public static void main(String[] args) {
               K x=new K();
               x.show();
               
               x6.show();
           }
          static  void  show(){
              System.out.println("hii");
           }
   }

