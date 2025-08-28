public class G{
    
   public static void main(String[] args) {
       Byte x=Byte.valueOf("678");
       System.out.println(x);
   }
}
// Exception in thread "main" java.lang.NumberFormatException: Value out of range. Value:"678" Radix:10
//         at java.base/java.lang.Byte.parseByte(Byte.java:197)
//         at java.base/java.lang.Byte.valueOf(Byte.java:251)
//         at java.base/java.lang.Byte.valueOf(Byte.java:277)
//         at G.main(G.java:4)