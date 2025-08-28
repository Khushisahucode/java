package P.Q.R;

import X.Y.B;

class A {

    public static void main(String[] args) {
        B x=new B() ;
        System.out.print("value of y is : ");
        System.out.print(x.y);

    }
}/*
P\Q\R\A.java:10: error: y is not public in B; cannot be accessed from outside package
        System.out.print(x.y);
                          ^
1 error */


