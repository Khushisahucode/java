import java.io.File;
import java.io.IOException;;
public class I{
    public static void main(String[]args)  throws IOException{
    File file=new File("demo/bheem.txt");
      boolean flag =file.mkdir();
      
       System.out.println(" directory exists   : " + file.exists());
      
      System.out.println(" is directory created  : " + flag);
    }
}