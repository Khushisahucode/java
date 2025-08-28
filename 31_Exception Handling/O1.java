import java.io.FileNotFoundException;
import java.io.FileReader;
public class O1 {
    public static void main(String[]args) throws FileNotFoundException{
     System.out.println("A");
        FileReader  r= new FileReader("golu.text");//file exist
        System.out.println("B");
 }
}
// PS C:\Users\sahuj\java coaching code\31_Exception Handling> java O1
// A
// B