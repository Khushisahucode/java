import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class B{
    public static void main(String[]args) throws IOException{
        File file=new File("bheem.txt");//bheem.txt is not exists
        FileWriter fr=new FileWriter(file);
         fr.write(65);
         String str="hello guys i am khushi";
         fr.write(str);
     fr.close();
    }
}
