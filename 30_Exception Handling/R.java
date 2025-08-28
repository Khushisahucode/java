
public class R {

    public static void main(String[] args) {
        System.out.println("A");
        int i = Integer.parseInt(args[0]);
        int y[] = {2, 0, 4};
        System.out.println(y[i]);
        System.out.println("C");
        int z = 12 / y[i];
        try {
            System.out.println("D");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);

        } catch (NumberFormatException e) {
            System.out.println(e);

        } 
         finally {
            System.out.println("essential code");
        }

        System.out.println("F");
    }

}
// PS C:\Users\sahuj\java coaching code\30_Exception Handling> java R
// A
// Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
//         at R.main(R.java:7)
// PS C:\Users\sahuj\java coaching code\30_Exception Handling> java R 0
// A
// 2
// C
// D
// essential code
// F
// PS C:\Users\sahuj\java coaching code\30_Exception Handling> java R 1
// A
// 0
// C
// Exception in thread "main" java.lang.ArithmeticException: / by zero
//         at R.main(R.java:12)
// PS C:\Users\sahuj\java coaching code\30_Exception Handling> java R om
// A
// Exception in thread "main" java.lang.NumberFormatException: For input string: "om"
//         at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
//         at java.base/java.lang.Integer.parseInt(Integer.java:588)
//         at java.base/java.lang.Integer.parseInt(Integer.java:685)
//         at R.main(R.java:7)
// PS C:\Users\sahuj\java coaching code\30_Exception Handling> java R o2
// A
// Exception in thread "main" java.lang.NumberFormatException: For input string: "o2"
//         at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
//         at java.base/java.lang.Integer.parseInt(Integer.java:588)
//         at java.base/java.lang.Integer.parseInt(Integer.java:685)
//         at R.main(R.java:7)