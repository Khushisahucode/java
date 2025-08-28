 final public class B {
    public static void main(String[] args) {
        B a=new B();
        a.pro();
        A b=new A();
        b.pro();
    }
    void pro()
    {
        System.out.print("hello guys");
    }

}
class A extends B
{
void pro()
    {
      int x=34;
      System.out.print(x);
    }

}
/*B.java:15: error: cannot inherit from final B
class A extends B
                ^
1 error*/



