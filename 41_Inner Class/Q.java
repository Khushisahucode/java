public class Q {
    class A{
        class B{
            class C{
                class D{

                }
            }
        }
    }
    public static void main(String[] args) {
        Q q=new Q();
      A a=q.new A();
      A.B b=a.new B();
      A.B.C c=b.new C();
      A.B.C.D d=c.new D();
      System.out.println(q);
       System.out.println(a);
         System.out.println(b);
           System.out.println(c);
             System.out.println(d);

    }
}
// Q@1f32e575
// Q$A@279f2327
// Q$A$B@2ff4acd0
// Q$A$B$C@54bedef2
// Q$A$B$C$D@5caf905d