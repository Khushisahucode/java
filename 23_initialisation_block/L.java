
public class L {
    static {
   System.out.println("AAA");
   pro();
    }
    {
        System.out.println("CCC");
        pro();//ok
    }
    L(){
        System.out.println("BBB");
    }
   static  void pro( ){
        System.out.println("hello");
    }
    public static void main(String[] args) {
        System.out.println("main start ");
        L x=new L();
       x.pro();
      System.out.println("main end");
         // x.pro();

      }
    }

