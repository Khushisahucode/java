class C{
    public static void main(String[]args){
   x1.bbb();
System.out.println("R");
    }
}
class x2{
    static void aaa(){
   System.out.println("K");
   x3.ccc();
    }
}
    class x1{
    static void bbb(){
         System.out.println("U");
        x2.aaa();
    }
}
class x3{
    static void ccc(){
        System.out.println("Y");
        int y=12/0;
    }
}
// PS C:\Users\sahuj\java coaching code\32_Stack Trace> java C
// U
// K
// Y
// Exception in thread "main" java.lang.ArithmeticException: / by zero
//         at x3.ccc(C.java:22)
//         at x2.aaa(C.java:10)
//         at x1.bbb(C.java:16)
//         at C.main(C.java:3)