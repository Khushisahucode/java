import java.io.File;
import java.io.IOException;;
public class C {
    public static void main(String[]args)  throws IOException{
    File file=new File("abc.txt");
      boolean flag= file.exists();
      System.out.println(flag);
    }
}
