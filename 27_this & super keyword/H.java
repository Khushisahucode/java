
    class x2
    {
        int x=90;
    }
    
    public class H extends x2 {
        int x=111;//member varible
         void pro(){
            int x=1000;
            System.out.println("value of x = "+x);
        }
          public static void main(String[]args){
               H x=new H();
              x.pro();
         }
    }
//value of x = 1000