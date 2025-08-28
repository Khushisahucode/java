class A{
synchronized void aaa(){
    B y=new B();
    y.bbb();
}
}
class B{
synchronized void bbb(){
    C z=new C();
   z.ccc();
}
}
class C{
synchronized void ccc(){
   
}
}
public class F {
    public static void main(String[] args) {
          A x=new A() ;
          x.aaa();
    }

}
