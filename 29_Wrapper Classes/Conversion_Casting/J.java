public class J {
 //  Range-----> no
    public static void main(String[] args) {
        Byte x=128;
        Short y=32768;
        Character z=65536;
        System.out.println(x);
    System.out.println(y);
    System.out.println(z);
    }
}
// J.java:4: error: incompatible types: int cannot be converted to Byte
//         Byte x=128;
//                ^
// J.java:5: error: incompatible types: int cannot be converted to Short
//         Short y=32768;
//                 ^
// J.java:6: error: incompatible types: int cannot be converted to Character
//         Character z=65536;
