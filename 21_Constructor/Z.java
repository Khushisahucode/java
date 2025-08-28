
    class z1{
         int a=90;
         static Boolean p ;
          void aaa(){
          System.out.println("aaa() in z1......");
          
          }
          static void abc(){
            System.out.println("static abc().......");
          }
           }
           class z2 extends z1{
          int b=56;
          static float q=3.4f;
          void bbb(){
          System.out.println("bbb() in z2......");
          }static void mno(){
            System.out.println("static mno()......");
          }

           }
           class z3 extends z2{
          char c='h';
          static char r='w';
          void ccc(){
          System.out.println("ccc() in z3.......");
          }

           static void pqr(){
            System.out.println("static pqr()......");
          }
        }
           
           
           public class Z{
          public static void main(String[]args){
             z3 x=new z3() ;
           System.out.println(x.p);
             x.abc();
            System.out.println(x.q);
            x.mno();
            System.out.println(x.r);
            x.pqr();
        
          
          
          }
          
          }
          
    
      
    
