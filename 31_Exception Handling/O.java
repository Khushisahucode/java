
//checked Exception 


import java.io.FileReader;
public class O {
    
    public static void main(String[]args){
     System.out.println("A");
        FileReader  r= new FileReader("golu.text");
        System.out.println("B");
 }
}
// O.java:10: error: unreported exception FileNotFoundException; must be caught or declared to be thrown
//         FileReader  r= new FileReader("golu.text");
//                        ^
// 1 error