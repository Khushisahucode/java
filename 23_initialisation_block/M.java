public class M {
    static {
   System.out.println("AAA");
    }
    {  pro();
        System.out.println("CCC");
    }
    M(){
        System.out.println("BBB");
    }
    void pro( ){
        System.out.println("hello");
    }
    public static void main(String[] args) {
        System.out.println("main start ");
        M x=new M();
       x.pro();
      System.out.println("main end");
         

      }
    }

