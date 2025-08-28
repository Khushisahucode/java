
import java.io.FileNotFoundException;
import java.io.FileReader;

public class T1 {
    
    public static void main(String[]args)throws FileNotFoundException{
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

// PS C:\Users\sahuj\java coaching code\32_Stack Trace> java L.java
// S
// J
// Q
// Y
// Exception in thread "main" java.io.FileNotFoundException: abc.text (The system cannot find the file specified)
//         at java.base/java.io.FileInputStream.open0(Native Method)
//         at java.base/java.io.FileInputStream.open(FileInputStream.java:219)
//         at java.base/java.io.FileInputStream.<init>(FileInputStream.java:159)
//         at java.base/java.io.FileInputStream.<init>(FileInputStream.java:112)
//         at java.base/java.io.FileReader.<init>(FileReader.java:60)
//         at L.ccc(L.java:24)
//         at L.aaa(L.java:14)
//         at L.bbb(L.java:19)
//         at L.main(L.java:9)