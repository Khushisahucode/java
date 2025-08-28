public class E2 {
    
    
    public static void main(String[] args) {
        Integer x=new Integer("84373$%&");
        System.out.println("value of x = "+ x);
    }
}
// E2.java:5: warning: [removal] Integer(String) in Integer has been deprecated and marked for removal
//         Integer x=new Integer("84373$%&");
//                   ^
// 1 warning
// Exception in thread "main" java.lang.NumberFormatException: For input string: "84373$%&"
//         at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
//         at java.base/java.lang.Integer.parseInt(Integer.java:588)
//         at java.base/java.lang.Integer.<init>(Integer.java:1065)
//         at E2.main(E2.java:5)
