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

public class V5 extends cde {
    V5()  {
        try {
           super() ;
        } catch (FileNotFoundException e) {
        }
        
    }
    public static void main(String[] args){
        System.err.println("A");
        V5 v1=new V5();
        System.out.println("B");
    }}
// }
// V5.java:23: error: explicit constructor invocation not allowed here
//            super() ;
//                 ^
// 1 error