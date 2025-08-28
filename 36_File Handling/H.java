import java.io.File;
import java.io.IOException;;
public class H{
    public static void main(String[]args)  throws IOException{
    File file=new File("demo/bheem.txt");
      boolean flag =file.exists();
      
      
      
      System.out.println(" directory exists   : " + flag);
    }
}
// directory exists   : false