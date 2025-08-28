package P.Q.R;

import X.Y.B;

class A {

    public static void main(String[] args) {
        B x=new B() ;
        System.out.print(x.y);

    }
}

/*
 * P\Q\R\A.java:3: error: B is not public in X.Y; cannot be accessed from outside package
import X.Y.B;
          ^
P\Q\R\A.java:8: error: B is not public in X.Y; cannot be accessed from outside package
        B x=new B() ;
        ^
P\Q\R\A.java:8: error: B is not public in X.Y; cannot be accessed from outside package
        B x=new B() ;
                ^
3 errors
 */
