package p.q;
import a.b.c.A;
public class B extends A {
    public static void main(String[]args){
        B b1=new B();//OK
       // NOT OK A a1=new A(); 
        b1.showinfo();
        System.out.print("value of  X :");
        System.out.print(b1.x);
    }
}
