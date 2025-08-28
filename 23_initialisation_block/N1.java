public class N1 {
    
    {
        System.out.println("hello");
        System.out.println(x);
    }
    int x;
    N1(){
        System.out.println("constructor");
    }
    public static void main(String[] args) {
        N1 x=new N1();
    }
}
/*
 * N1.java:5: error: illegal forward reference
        System.out.println(x);
                           ^
1 error
 */