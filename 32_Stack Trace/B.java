public class B {
    public static void main(String[]args){
    bbb();
System.out.println("R");
    }
    static void aaa(){
   System.out.println("K");
   ccc();
    }
    static void bbb(){
         System.out.println("U");
        aaa();
    }
    static void ccc(){
        System.out.println("Y");
        int y=12/0;
    }
}
// U
// K
// Y
// Exception in thread "main" java.lang.ArithmeticException: / by zero
//         at B.ccc(B.java:18)
//         at B.aaa(B.java:9)
//         at B.bbb(B.java:14)
//         at B.main(B.java:3)