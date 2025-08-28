
    import java.io.FileReader;
import java.io.FileNotFoundException;

class abc{
abc() throws FileNotFoundException{
    FileReader x=new FileReader("abc.txt");
}
}

class cde extends abc{
  cde(){
    super ();
  }
}

public class V1 extends cde {
    V1(){
        super();
    }
    public static void main(String[] args) {
        System.err.println("A");
        V1 v1=new V1();
        System.out.println("B");
    }
}
// V1.java:13: error: unreported exception FileNotFoundException; must be caught or declared to be thrown
//     super ();
//           ^
// 1 error
