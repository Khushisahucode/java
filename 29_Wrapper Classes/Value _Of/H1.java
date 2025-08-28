public class H1 {
    
    
 public static void main(String[] args) {
      
    Long x=Long.valueOf("3456f");
       System.out.println(x);
   }
}
// Exception in thread "main" java.lang.NumberFormatException: For input string: "3456f"
//         at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
//         at java.base/java.lang.Long.parseLong(Long.java:618)
//         at java.base/java.lang.Long.valueOf(Long.java:974)
//         at H1.main(H1.java:6)

