public class Q3 {
    int x=11;
    class A{
        int x=13;
        class B{
            int x=15;
            class C extends aa{
                int x=17;
                class D {
                int x=19;
                void pro(){ int x=21;
                System.out.println(x);
                  System.out.println(this.x);
                    System.out.println(C.this.x);
                      System.out.println(B.this.x);
                      System.out.println(A.this.x);
                        System.out.println(Q3.this.x);
                   System.out.println(C.super.x); } } }
    }}
    public static void main(String[] args) {
        Q3 q=new Q3();
      A a=q.new A();
      A.B b=a.new B();
      A.B.C c=b.new C();
      A.B.C.D d=c.new D();
       d.pro();

    }
}
class aa{
    int x=23;
}
// 21
// 19
// 17
// 15
// 13
// 11
// 23