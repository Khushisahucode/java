import java.io.File;
import java.io.IOException;
class Q{
    public static void main(String[]args) {
     // File file=new File("khushi");
    // boolean x= file.mkdir();
     File file2=new File("khushi/abc.txt");
     try{
    file2.createNewFile();}
     catch(IOException e){
   e.printStackTrace();
     }

    }
}