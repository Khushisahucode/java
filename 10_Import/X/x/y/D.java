package x.y;
import a.A;
import a.b.B;
import a.b.c.C;
public class D {
    public static void main(String[]args ){
      C c1 =new C();
      System.out.print("value of p3 :");
      System.out.println(c1.p3);
      B b =new B();
      System.out.print("value of p2 :");
      System.out.println(b.p2);
      
      A a1 =new A();
      System.out.print("value  of p1 :");
      System.out.println(a1.p1);
      
    }
  }/*
  value of p3 :454
value of p2 :9000
value  of p1 :45 */