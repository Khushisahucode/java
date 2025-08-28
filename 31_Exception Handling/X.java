public class X {
    public static void main(String[] args) {
        try {
            System.out.println("X");
            int y=12/0;
        } catch (ArithmeticException e) {
            throw new NullPointerException();
        }finally{
    
   System.out.println("Z");
             if(12<13)
            throw new ClassCastException();
            }
            System.out.println("B");
}
}
// X
 // Z
//Exception in thread "main" java.lang.ClassCastException
 //       at X.main(X.java:12)