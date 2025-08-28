import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
class G{
 public static void main(String[]args )throws IOException{
         File file=new File("kk.txt");
         FileWriter fr=new FileWriter(file);
         BufferedWriter br=new BufferedWriter(fr);
          br.write("hello guys myself khushi!!!");
          br.newLine();
         br.write("i am from narsinghpur");
         br.newLine();
      br.write("i am well skilled in java programming ");
      br.flush();
        }
}
