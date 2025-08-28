import java.io.File;
import java.io.IOException;;
public class B {
    public static void main(String[]args)  throws IOException{
    File file=new File("abc.txt");
       file.createNewFile();
    }
}
