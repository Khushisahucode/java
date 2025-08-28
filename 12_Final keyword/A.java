public class A {
    public static void main(String[] args) {
       A x=new A();
       x.pro();
       B y=new B();
       y.pro();

        
    }
    void pro()
    {int x=90;
        System.out.println(x);
    }

}
class B extends A
{
void pro()
    {
      int x=34;
      System.out.print(x);
    }

}


