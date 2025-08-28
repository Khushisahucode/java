import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
class I{
 public static void main(String[]args )throws IOException{
         File file=new File("PK.txt");
         FileWriter fr=new FileWriter(file);
         PrintWriter pw=new PrintWriter(fr);
         pw.print("you are most welcome in programming world");
         pw.print("hello java!!");
         pw.print(true);
        pw.print(12);
        pw.print(45.56);
        pw.print("Amit");
         pw.close();
        }
}