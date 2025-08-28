package p.q;
import a.b.c.A;
public class B extends A {
    public static void main(String[]args){
        A a1=new A();
        a1.showinfo();
        System.out.print("value of  X :");
        System.out.print(a1.x);
    }
}
/*
 * p\q\B.java:6: error: showinfo() has protected access in A
        a1.showinfo();
          ^
p\q\B.java:8: error: x has protected access in A
        System.out.print(a1.x);
                           ^
2 errors
 */
