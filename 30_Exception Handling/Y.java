public class Y {
    
    static{
    int y=12/0;
}
public static void main(String[] args) {
        System.out.println("main start");
        X x=new X();
        System.out.println("main end");
    }
}
// Exception in thread "main" java.lang.ExceptionInInitializerError
// Caused by: java.lang.ArithmeticException: / by zero
//         at Y.<clinit>(Y.java:6)