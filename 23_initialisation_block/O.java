public class O {
    
   static {
        System.out.println("hello");
        System.out.println(x);
    }
    static int x;
    O(){
        System.out.println("constructor");
    }
    public static void main(String[] args) {
        O x=new O();
    }
}
/*
 * O.java:5: error: illegal forward reference
        System.out.println(x);
                           ^
1 error
 */