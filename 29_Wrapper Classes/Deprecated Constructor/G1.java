public class G1{

    public static void main(String[] args) {
        Double x= new Double("mohan");
        System.out.println(x);
    }
}
//        Double x= new Double("mohan");
//                   ^
// 1 warning
// Exception in thread "main" java.lang.NumberFormatException: For input string: "mohan"
//         at java.base/jdk.internal.math.FloatingDecimal.readJavaFormatString(FloatingDecimal.java:2054)
//         at java.base/jdk.internal.math.FloatingDecimal.parseDouble(FloatingDecimal.java:110)
//         at java.base/java.lang.Double.parseDouble(Double.java:944)
//         at java.base/java.lang.Double.<init>(Double.java:1040)
//         at G1.main(G1.java:4)