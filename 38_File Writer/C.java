import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class C{
    public static void main(String[]args) throws IOException{
        File file=new File("chutki.txt");//chutki.txt is not exists
        FileWriter fr=new FileWriter(file);
         
         String str="chutki is the major charactor of chota bheem";
         fr.write(str);
         fr.flush();
    // fr.close();
    }
}