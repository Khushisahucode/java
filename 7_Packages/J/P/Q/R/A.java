package P.Q.R;

import X.Y.B;

class A {

    public static void main(String[] args) {
        B x=new B() ;
        x.show();
       
    }
}
/*
 * .\X\Y\B.java:8: error: <identifier> expected
    System.out.print.(x*y);
                     ^
P\Q\R\A.java:9: error: show() is not public in B; cannot be accessed from outside package
        x.show();
         ^
.\X\Y\B.java:8: error: cannot find symbol
    System.out.print.(x*y);
              ^
  symbol:   variable print
  location: variable out of type PrintStream
3 errors
 */
