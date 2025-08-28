package x.y;
import p.q.r.A;
public class E {

//access through inheritance
public static void main(String[]args){
        E e1=new E();
        e1.show();
        e1.pro();
    }

}/*
x\y\D.java:2: error: A is not public in p.q.r; cannot be accessed from outside package
import p.q.r.A;
            ^
x\y\D.java:6: error: A is not public in p.q.r; cannot be accessed from outside package
        A a1=new A();
        ^
x\y\D.java:6: error: A is not public in p.q.r; cannot be accessed from outside package
        A a1=new A();
                 ^
3 errors
 */



    

