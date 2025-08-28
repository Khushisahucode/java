package x.y;
import p.q.r.A;
//access through instanciation
public class D {
    public static void main(String[]args){
        A a1=new A();
        a1.show();
        a1.pro();
    }
    
}
/*

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