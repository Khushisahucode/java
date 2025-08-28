public class F3 {
    
   public static void main(String[] args) {
       Short x=Short.valueOf("3h4");
       System.out.println(x);
   }
}
// Exception in thread "main" java.lang.NumberFormatException: For input string: "3h4"
//         at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
//         at java.base/java.lang.Integer.parseInt(Integer.java:588)
//         at java.base/java.lang.Short.parseShort(Short.java:138)
//         at java.base/java.lang.Short.valueOf(Short.java:194)
//         at java.base/java.lang.Short.valueOf(Short.java:220)
//         at F3.main(F3.java:4)

