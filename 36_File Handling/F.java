import java.io.File;
import java.io.IOException;;
public class F {
    public static void main(String[]args)  throws IOException{
    File file=new File("demo");
      boolean flag= file.isDirectory();
      System.out.println(flag);
      
      
      System.out.println("is directory exists ?  " + flag);
    }
}
