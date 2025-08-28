import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class F{
 public static void main(String[]args )throws IOException{
         File file=new File("khushi.txt");
         FileWriter fr=new FileWriter(file);
          fr.write("hello guys myself khushi!!!");
     fr.write("i am from narsinghpur ");
      fr.write("i am well skilled in java programming ");
      fr.flush();
        }
}