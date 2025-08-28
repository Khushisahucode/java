public class P2 {
   // static int x=90;
    static {
        System.out.println("hello");
      pro();
    }
      static void pro(){
       System.out.println(x);
       System.out.println("hii....");
    }

  static  int x=99;
    P2(){
        System.out.println("constructor");
    }
    public static void main(String[] args) {
        P2 x=new P2();
        x.pro();
    }
}
/*
 * hello
0
hii....
constructor
99
hii....
 */