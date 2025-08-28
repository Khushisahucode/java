public class K {
     //  Constant----> no
    public static void main(String[] args) {
       int m=34;
        Byte x= m;
        Short y=m;
        Character z= m;
        System.out.println(x);
    System.out.println(y);
    System.out.println(z);
    }
}
//       Byte x= m;
//                 ^
// K.java:7: error: incompatible types: int cannot be converted to Short
//         Short y=m;
//                 ^
// K.java:8: error: incompatible types: int cannot be converted to Character
//         Character z= m;
//                      ^
// 3 errors

