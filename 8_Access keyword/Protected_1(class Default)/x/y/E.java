package x.y;
import p.q.r.A;

public class E extends A {

//access through inheritance
public static void main(String[]args){
        E e1=new E();
        e1.show();
        e1.pro();
    }

}
/*
 * x\y\E.java:2: error: A is not public in p.q.r; cannot be accessed from outside package
import p.q.r.A;
            ^
x\y\E.java:4: error: A is not public in p.q.r; cannot be accessed from outside package
public class E extends A {
                       ^
x\y\E.java:9: error: cannot find symbol
        e1.show();
          ^
  symbol:   method show()
  location: variable e1 of type E
x\y\E.java:10: error: cannot find symbol
        e1.pro();
          ^
  symbol:   method pro()
  location: variable e1 of type E
4 errors
 */
    

