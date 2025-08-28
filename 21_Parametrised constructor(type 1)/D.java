class Y{
    Y(int x){
        System.out.println("hello");
    }
}

public class D extends Y {
    public static void main(String[] args) {
       System.out.println("A") ;
        D d=new D();
        System.out.println("B");
    }
}
/*
 * D.java:7: error: constructor Y in class Y cannot be applied to given types;
public class D extends Y {
       ^
  required: int
  found:    no arguments
  reason: actual and formal argument lists differ in length
1 error
 */
