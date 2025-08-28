import java.io.File;
import java.io.IOException;;
public class D {
    public static void main(String[]args)  throws IOException{
    File file=new File("bheem.txt");
      boolean flag= file.exists();
      System.out.println(flag);
      boolean f=file.createNewFile();
      System.out.println("is file created ? " + f);
      System.out.println("is file exists ?  " + file.exists());
    }
}
