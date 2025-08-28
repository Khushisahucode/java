
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

public class V3 extends cde {
    V3()  throws FileNotFoundException{
        super();
    }
    public static void main(String[] args) {
        System.err.println("A");
        V3 v1=new V3();
        System.out.println("B");
    }
}
// V3.java:24: error: unreported exception FileNotFoundException; must be caught or declared to be thrown
//         V3 v1=new V3();
//               ^
// 1 error
