import java.io.File;
import java.io.IOException;
class R1{
    public static void main(String[]args) {
     // File file=new File("khushi");
    File file2=new File("demo","xyz.txt");
     try{
        
    file2.createNewFile();}
     catch(IOException e){
   e.printStackTrace();
     }

    }
}