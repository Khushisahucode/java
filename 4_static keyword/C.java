public class C {
    static int x=999;
    public static void main(String[] args) {
        C a=new C();
        a.pro();
        x=888;
        C b=new C();
        C c=new C();
        b.pro();
        c.pro();
    }
    void pro(){
        
  System.out.print("value of x is = ");     
System.out.println(x);
        }
    

}
