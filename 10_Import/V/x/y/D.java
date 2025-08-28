package x.y;

import a.b.*;

public class D {

    public static void main(String[] args) {

        C  c1 = new C();
        System.out.print("value of p3 :");
        System.out.println(c1.p3);

    }

}/*
x\y\D.java:11: error: cannot find symbol
        System.out.println(c1.p3);
                             ^
  symbol:   variable p3
  location: variable c1 of type C
1 error */
