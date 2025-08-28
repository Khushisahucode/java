//checked Exception 

import java.io.FileNotFoundException;
import java.io.FileReader;
public class N {
    
    public static void main(String[]args){
     System.out.println("A");
        FileReader  r= new FileReader("golu.text");// file not exist
        System.out.println("B");
 }
}
// N.java:7: error: unreported exception FileNotFoundException; must be caught or declared to be thrown
//         FileReader  r= new FileReader("golu.text");
//                        ^
//1 error

