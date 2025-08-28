
class Y2{
    Y2(int x){
        System.out.println("hello");
    }
}

public class E1 extends Y2 {
    E1(){
super();
    }
    public static void main(String[] args) {
       System.out.println("A") ;
        E1 s=new E1();
        System.out.println("B");
    }
}
/*
 * F.java:10: error: constructor Y2 in class Y2 cannot be applied to given types;
super();
^
  required: int
  found:    no arguments
  reason: actual and formal argument lists differ in length
1 error

 */