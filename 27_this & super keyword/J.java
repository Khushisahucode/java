
    
class x4
{
   private int x=90;
   int info()
   {
    return x;
   }
}

public class J extends x4 {
      int x=111;//member varible
      void pro(){
       int x=1000;
        System.out.println("value of  pro method = "+x);
        System.out.println("value of x from  class J  = "+this.x);
        System.out.println("value of x from  class x4 = "+info());
         } 
      public static void main(String[]args){
           J x=new J();
          x.pro();
     }
}
// value of  pro method      = 1000
// value of x from  class J  = 111
// value of x from  class x4 = 90