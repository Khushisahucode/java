import java.io.IOException;
import java.io.FileNotFoundException;

public class E{
    
    public static void main(String [] args){
        try{
         FileNotFoundException x=new  FileNotFoundException(); //checked  ---->FileNotFoundxception
         throw x;
        }catch(  E e){  //checked  ---->FileNotFoundxception 

        }
    }
}
// E.java:10: error: incompatible types: E cannot be converted to Throwable
//         }catch(  E e){  //checked + unchecked  ---->FileNotFoundxception 
//                  ^
// 1 error
