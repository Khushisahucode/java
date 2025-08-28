public class P1 {
    //int x=90;
    {
        System.out.println("hello");
      pro();
    }
     void pro(){
       System.out.println(x);
       System.out.println("hii....");
    }

    int x=99;
    P1(){
        System.out.println("constructor");
    }
    public static void main(String[] args) {
        P1 x=new P1();
        x.pro();
    }
}
/*
 *hello
0
hii....
constructor
99
hii....
 
 */

 