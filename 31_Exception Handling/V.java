
import java.io.FileReader;
import java.io.FileNotFoundException;

class abc{
abc(){
    FileReader x=new FileReader("abc.txt");
}
}

class cde extends abc{
  cde(){
    super ();
  }
}

public class V extends cde {
    V(){
        super();
    }
    public static void main(String[] args) {
        System.err.println("A");
        V v1=new V();
        System.out.println("B");
    }
}
// V.java:7: error: unreported exception FileNotFoundException; must be caught or declared to be thrown
//     FileReader x=new FileReader("abc.txt");
//                  ^
// 1 error