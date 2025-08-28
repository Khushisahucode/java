import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
class K{
 public static void main(String[]args )throws IOException{
         File file=new File("SRK.txt");
         FileWriter fr=new FileWriter(file);
         PrintWriter pw=new PrintWriter(fr);
         String str="khushi sahu";
         int age=22;
         float marks=87.8f;
        pw.printf("my name is %s and my age is %d and my marks in board exams is %f ",str,age,marks);
    
         pw.close();
        }
}
