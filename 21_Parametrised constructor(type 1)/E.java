class Y2{
    Y2(int x){
        System.out.println("hello");
    }
}

public class E extends Y2 {
    E(){

    }
    public static void main(String[] args) {
       System.out.println("A") ;
        E s=new E();
        System.out.println("B");
    }
}
/*
 * E.java:8: error: constructor Y2 in class Y2 cannot be applied to given types;
    E(){
       ^
  required: int
  found:    no arguments
  reason: actual and formal argument lists differ in length
1 error
 */

