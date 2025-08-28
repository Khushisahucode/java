public class B3 {
    public static void main(String[] args) {
  Byte x=new Byte("mohan");
  System.out.println(x);
    }
}

// Byte x=new Byte("mohan");
//        ^
// 1 warning
// Exception in thread "main" java.lang.NumberFormatException: For input string: "mohan"
//         at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
//         at java.base/java.lang.Integer.parseInt(Integer.java:588)
//         at java.base/java.lang.Byte.parseByte(Byte.java:195)
//         at java.base/java.lang.Byte.<init>(Byte.java:374)
//         at B3.main(B3.java:4)
