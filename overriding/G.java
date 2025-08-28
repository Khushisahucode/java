//not implemented 
    class x4{
        final  void pro(){
       System.out.println("hello");
         }
     }
     
     public class G extends x4{
         public static void main(String[] args) {
             G x=new G();
             x.pro();
         }
         void pro(){
            System.out.println("hii");
         }
}/*
G.java:13: error: pro() in G cannot override pro() in x4
         void pro(){
              ^
  overridden method is final
1 error */
