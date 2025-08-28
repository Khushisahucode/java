public class O1 {
    void pro(){
        System.out.println(x);
    }
    
    {
        System.out.println("hello");
       System.out.println(x);
    }
    int x=99;
    O1(){
        System.out.println("constructor");
    }
    public static void main(String[] args) {
        O1 x=new O1();
    }
}
/*
 * O1.java:8: error: illegal forward reference
        System.out.println(x);
                           ^
1 error

 */
