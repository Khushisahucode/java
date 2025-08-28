public class H {
    static{
        System.out.println("Y");
        int y=12/0;
    }
    public static void main(String[] args) {
        System.out.println("X");

    }
}
// Y
// Exception in thread "main" java.lang.ExceptionInInitializerError
// Caused by: java.lang.ArithmeticException: / by zero
//         at H.<clinit>(H.java:4)