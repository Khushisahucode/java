import java.io.File;
import java.io.IOException;
class U{
    public static void main(String[]args) throws IOException{
    
      File file=new File("chutki.txt");
     file.createNewFile();
      File dest=new File("jaggu.txt");
      boolean x= file.renameTo(dest);
      System.out.println(x);//true
     
        
    
     

    }
}