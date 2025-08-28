class I{
    static {
     System.out.println("B");
     int y=12/0;
    }
    public static void main(String []args){
  System.out.print("X");
    }
}
B
// Exception in thread "main" java.lang.ExceptionInInitializerError
// Caused by: java.lang.ArithmeticException: / by zero
//         at I.<clinit>(I.java:4)