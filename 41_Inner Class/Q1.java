public class Q1 {
    int x1=1;
    class A{
        int x2=11;
        class B{
            int x3=111;
            class C{
                int x4=1111;
                class D{
                int x5=11111;
                void pro(){
                System.out.println(x1);
                  System.out.println(x2);
                    System.out.println(x3);
                      System.out.println(x4);
                        System.out.println(x5);}
                
                }
            }
        }
    }
    public static void main(String[] args) {
        Q1 q=new Q1();
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