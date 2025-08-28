
//checked Exception 
import java.io.FileReader;
public class N2 {
    
    public static void main(String[]args){
     System.out.println("A");
     try {
          FileReader  r= new FileReader("golu.text");   // file not exist
     } catch (Exception e) {
        System.out.println(e);
     }
       
        System.out.println("B");
 }
}
// A
// java.io.FileNotFoundException: golu.text (The system cannot find the file specified)
// B
