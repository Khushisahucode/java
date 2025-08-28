public class Z1 {
static int []x=new int[-1];
    public static void main(String[] args) {
        System.out.println(x[0]);
    }
}
/*
 * Exception in thread "main" java.lang.ExceptionInInitializerError
Caused by: java.lang.NegativeArraySizeException: -1
        at Z1.<clinit>(Z1.java:2)

 */