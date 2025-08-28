public class B5 extends/*RuntimeException */  {
    
     public static void main(String [] args) throws Throwable{
       B5  x =new B5(); //unchecked  ---->Exception
         throw x;
        }
}
// B5.java:5: error: incompatible types: B5 cannot be converted to Throwable
//          throw x;
//          ^
// 1 error

