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
x\y\D.java:7: error: show() has protected access in A
        a1.show();
          ^
x\y\D.java:8: error: pro() has protected access in A
        a1.pro();
          ^
2 errors

 */