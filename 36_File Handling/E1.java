import java.io.File;
import java.io.IOException;;
public class E1 {
    public static void main(String[]args)  throws IOException{
    File file=new File("A.java");
      boolean flag= file.isFile();
      System.out.println(flag);
      
      
      System.out.println("is file exists ?  " + file.exists());
    }
}
// true
// is file exists ?  true