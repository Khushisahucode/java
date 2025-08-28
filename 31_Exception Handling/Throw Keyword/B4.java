public class B4 {
     public static void main(String [] args) throws Throwable{
        Object  x =new Object(); //unchecked  ---->Exception
         throw x;
        }
}
// B4.java:4: error: incompatible types: Object cannot be converted to Throwable
//          throw x;
//          ^
// 1 error