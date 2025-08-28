public class D2 {
    
    
    public static void main(String[] args) {
        Float x= Float.valueOf("mohan");
        System.out.println(x);
    }
}
// Exception in thread "main" java.lang.NumberFormatException: For input string: "mohan"
//         at java.base/jdk.internal.math.FloatingDecimal.readJavaFormatString(FloatingDecimal.java:2054)
//         at java.base/jdk.internal.math.FloatingDecimal.parseFloat(FloatingDecimal.java:122)
//         at java.base/java.lang.Float.parseFloat(Float.java:570)
//         at java.base/java.lang.Float.valueOf(Float.java:533)
//         at D2.main(D2.java:5)
