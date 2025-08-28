 //checked Exception 
import java.io.FileNotFoundException;
import java.io.FileReader;
public class N1 {
    public static void main(String[]args) throws FileNotFoundException{
     System.out.println("A");
        FileReader  r= new FileReader("golu.text");   // file not exist
        System.out.println("B");
 }
}
// PS C:\Users\sahuj\java coaching code\31_Exception Handling> java N1     
// A
// Exception in thread "main" java.io.FileNotFoundException: golu.text (The system cannot find the file specified)
//         at java.base/java.io.FileInputStream.open0(Native Method)
//         at java.base/java.io.FileInputStream.open(FileInputStream.java:219)
//         at java.base/java.io.FileInputStream.<init>(FileInputStream.java:159)
//         at java.base/java.io.FileInputStream.<init>(FileInputStream.java:112)
//         at java.base/java.io.FileReader.<init>(FileReader.java:60)
//         at N1.main(N1.java:8)