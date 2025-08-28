public class C {
    public static void main(String[] args) {
       C x=new C();
       x.add();
       D y=new D();
       y.add();
    }
    void add()
    {
        int x=89;int y=67;
        System.out.print("Addition is = ");
        System.out.println(x+y);
    }

}
class D
{
void add()
{
    System.out.print("hello khushi");
}
}