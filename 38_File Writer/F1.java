import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class F1{
 public static void main(String[]args )throws IOException{
         File file=new File("madhu.txt");
         FileWriter fr=new FileWriter(file);
          fr.write("hello guys myself khushi!!!\n");

     fr.write("i am from narsinghpur\n ");
      fr.write("i am well skilled in java programming ");
      fr.flush();
        }
}