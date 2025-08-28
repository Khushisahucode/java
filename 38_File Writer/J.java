import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
class J{
 public static void main(String[]args )throws IOException{
         File file=new File("RCB.txt");
         FileWriter fr=new FileWriter(file);
         PrintWriter pw=new PrintWriter(fr);
          pw.println(false);
        pw.println(78);
        pw.println(3.97);
        pw.println("Sumit");
         pw.close();
        }
}