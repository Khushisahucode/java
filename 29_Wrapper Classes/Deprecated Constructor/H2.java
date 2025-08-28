public class H2 {
   
    public static void main(String[]args){

        Float x= new Float("khushi");
        System.out.println(x);
    }

}
//         Float x= new Float("khushi");
//                  ^
// 1 warning
// Exception in thread "main" java.lang.NumberFormatException: For input string: "khushi"
//         at java.base/jdk.internal.math.FloatingDecimal.readJavaFormatString(FloatingDecimal.java:2054)
//         at java.base/jdk.internal.math.FloatingDecimal.parseFloat(FloatingDecimal.java:122)
//         at java.base/java.lang.Float.parseFloat(Float.java:570)
//         at java.base/java.lang.Float.<init>(Float.java:683)
//         at H2.main(H2.java:5
