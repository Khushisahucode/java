 class uu {
 
 void info() {
       class A{
        void pro(){
            System.out.println("namaskar");
        }
    }
    A x=new A();
    x.pro();
}}


public class R2{
public static void main(String[] args) {
    uu u=new uu();
     // u.info();ok
      A y=new A() ;
      y.info();//ok
}
}
// R2.java:17: error: cannot find symbol
//       y.pro();
//        ^
//   symbol:   method pro()
//   location: variable y of type A
// 1 error