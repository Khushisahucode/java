import java.io.FileNotFoundException;
import java.io.FileReader;

public class T2 {
    public static void main(String[]args){
     System.out.println("S");
        bbb();
System.out.println("E");
    }
    static void aaa()throws FileNotFoundException{
   System.out.println("Q");
   ccc();
    System.out.println("D");
    }
    static void bbb()throws FileNotFoundException{
         System.out.println("J");
        aaa();
         System.out.println("K");
    }
    static void ccc() throws FileNotFoundException{
        System.out.println("Y");
        FileReader x=new FileReader("abc.text");
         System.out.println("H");

    }
}
// L2.java:7: error: unreported exception FileNotFoundException; must be caught or declared to be thrown
//         bbb();
//            ^
// 1 error
