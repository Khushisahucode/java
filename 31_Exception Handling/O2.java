//checked Exception 
import java.io.FileNotFoundException;
import java.io.FileReader;
public class O2 {
    public static void main(String[]args){
     System.out.println("A");
     try {
          FileReader  r= new FileReader("golu.text");   //file exist
     } catch (Exception e) {
        System.out.println(e);
     }
       
        System.out.println("B");
 }
}
// PS C:\Users\sahuj\java coaching code\31_Exception Handling> java O2
// A
// B
