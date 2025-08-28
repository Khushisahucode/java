public class E1 {
    
    public static void main(String[] args) {
        Integer x=new Integer("mohan");
        System.out.println("value of x = "+ x);
    }
}
// E1.java:4: warning: [removal] Integer(String) in Integer has been deprecated and marked for removal
//         Integer x=new Integer("mohan");
//                   ^
// 1 warning
// Exception in thread "main" java.lang.NumberFormatException: For input string: "mohan"
//         at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
//         at java.base/java.lang.Integer.parseInt(Integer.java:588)
//         at java.base/java.lang.Integer.<init>(Integer.java:1065)
//         at E1.main(E1.java:4)
