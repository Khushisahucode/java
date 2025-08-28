import java.io.File;
import java.io.IOException;
class X{
    public static void main(String[]args) throws IOException{
    
      File file=new File("chutki.txt");
     boolean x=file.delete();
      
      
      System.out.println("Is file deleted ?  "+x);//true
     
        
    
     

    }
}