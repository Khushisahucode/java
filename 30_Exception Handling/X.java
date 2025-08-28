public class X {

 {
    int y=12/0;
}


    public static void main(String[] args) {
        System.out.println("main start");
        X x=new X();
        System.out.println("main end");
    }
}
// main start
// Exception in thread "main" java.lang.ArithmeticException: / by zero
//         at X.<init>(X.java:4)
//         at X.main(X.java:10)