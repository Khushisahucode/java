public class Q2 {
    int x=11;
    class A{
        int x=13;
        class B{
            int x=15;
            class C{
                int x=17;
                class D{
                int x=19;
                void pro(){ int x=21;
                System.out.println(x);
                  System.out.println(this.x);
                    System.out.println(C.this.x);
                      System.out.println(B.this.x);
                      System.out.println(A.this.x);
                        System.out.println(Q2.this.x);}
                
                }
            }
        }
    }
    public static void main(String[] args) {
        Q2 q=new Q2();
      A a=q.new A();
      A.B b=a.new B();
      A.B.C c=b.new C();
      A.B.C.D d=c.new D();
       d.pro();

    }
}
// 1
// 11
// 111
// 1111
// 11111