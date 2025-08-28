import java.io.FileNotFoundException;
class D{
    public static void main(String [] args){
        try{
         D x=new D(); //unchecked  ---->Exception
         throw x;
        }catch(  Exception e){  //checked + unchecked  ---->Exception 

        }
    }
}
// D.java:6: error: incompatible types: D cannot be converted to Throwable
//          throw x;
//          ^
// 1 error