import java.io.File;
import java.io.IOException;;
public class J{
    public static void main(String[]args)  throws IOException{
    File file=new File("aaa/bheem.txt");
      boolean flag =file.mkdir();
      
       System.out.println(" directory exists   : " + file.exists());
      
      System.out.println(" is directory created  : " + flag);
    }
}
//  directory exists   : false
//  is directory created  : false