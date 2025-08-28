import java.io.File;
import java.io.IOException;;
public class G{
    public static void main(String[]args)  throws IOException{
    File file=new File("demo");
      String flag =file.getAbsolutePath();
      
      
      
      System.out.println(" directory is   : " + flag);
    }
}
// directory is   : D:\Java Coaching Code\36_File Handling\demo