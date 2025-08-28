package x.y;
import a.b.c.A;
class B
{
    public static void main(String[]args ){
        System.out.print(A.x);
    }
}

/*
 * x\y\B.java:2: error: A is not public in a.b.c; cannot be accessed from outside package
import a.b.c.A;
            ^
x\y\B.java:6: error: A is not public in a.b.c; cannot be accessed from outside package
        System.out.print(A.x);
                         ^
2 errors
 */
  
 