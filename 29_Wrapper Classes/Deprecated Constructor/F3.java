public class F3 {
    
    
    public static void main(String[] args) {
        Long x=new Long("mohan");
        System.out.println(x);
    }
}
// F3.java:5: warning: [removal] Long(String) in Long has been deprecated and marked for removal
//         Long x=new Long("mohan");
//                ^
// 1 warning
// Exception in thread "main" java.lang.NumberFormatException: For input string: "mohan"
//         at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
//         at java.base/java.lang.Long.parseLong(Long.java:618)
//         at java.base/java.lang.Long.<init>(Long.java:1160)
//         at F3.main(F3.java:5)

