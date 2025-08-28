
     import java.io.FileReader;
import java.io.FileNotFoundException;

class abc{
abc() throws FileNotFoundException{
    FileReader x=new FileReader("abc.txt");
}
}

class cde extends abc{

  cde()throws FileNotFoundException{
    super ();
  }
}

public class V4 extends cde {
    V4()  throws FileNotFoundException{
        super();
    }
    public static void main(String[] args)throws FileNotFoundException {
        System.err.println("A");
        V4 v1=new V4();
        System.out.println("B");
    }
}
// A
// Exception in thread "main" java.io.FileNotFoundException: abc.txt (The system cannot find the file specified)
//         at java.base/java.io.FileInputStream.open0(Native Method)
//         at java.base/java.io.FileInputStream.open(FileInputStream.java:219)
//         at java.base/java.io.FileInputStream.<init>(FileInputStream.java:159)
//         at java.base/java.io.FileInputStream.<init>(FileInputStream.java:112)
//         at java.base/java.io.FileReader.<init>(FileReader.java:60)
//         at abc.<init>(V4.java:7)
//         at cde.<init>(V4.java:14)
//         at V4.<init>(V4.java:20)
//         at V4.main(V4.java:24)