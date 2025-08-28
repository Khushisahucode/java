import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class D{
    public static void main(String[]args) throws IOException{
        File file=new File("sss.txt");//sss.txt chutki.txt is not exists
        FileWriter fr=new FileWriter(file);
         String str="chutki is the major charactor of chota bheem";
        
        for (int i = 0; i < str.length(); i++) {
        fr.write(str.charAt(i));  
     }
      fr.flush();
     fr.close();
    }
}