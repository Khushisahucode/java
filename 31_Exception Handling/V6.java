import java.io.FileReader;
import java.io.FileNotFoundException;

class abc{
abc() {
    try{
    FileReader x=new FileReader("abc.txt");
}catch(FileNotFoundException e){
System.out.println(e);
}
}}
class cde extends abc{

  cde()throws FileNotFoundException{
    super ();
  }
}

public class V6 extends cde {
    V6() throws FileNotFoundException {
    
           super() ;
       
        
    }
    public static void main(String[] args) throws FileNotFoundException{
        System.err.println("A");
        V6 v1=new V6();
        System.out.println("B");
    }}
// A
// java.io.FileNotFoundException: abc.txt (The system cannot find the file specified)
B