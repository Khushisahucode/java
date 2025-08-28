
    class x3
    {
        int x=90;
    }
    
    public class I extends x3 {
        int x=111;//member varible
         void pro(){
           int x=1000;
            System.out.println("value of  pro method = "+x);
            System.out.println("value of x from  class I  = "+this.x);
            System.out.println("value of x from  class x3 = "+super.x);
             } 
          public static void main(String[]args){
               I x=new I();
              x.pro();
         }
    }

    // value of  pro method = 1000
    // value of x from  class I  = 111
    // value of x from  class x3 = 90