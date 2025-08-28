public class B {
    public static void main(String[] args) {
    // Byte x=new Byte(23)
    byte a=23;
Byte x=new Byte(a);
System.out.println(a);
    }
}
// B.java:5: warning: [removal] Byte(byte) in Byte has been deprecated and marked for removal
// Byte x=new Byte(a);
//        ^
// 1 warning
// 23