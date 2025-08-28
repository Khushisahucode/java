import java.io.File;
import java.io.IOException;
class X1{
    public static void main(String[]args) throws IOException{
    
      File file=new File("kk/abc.txt");
     boolean x=file.delete();
      
      
      System.out.println("Is file deleted ?  "+x);//true
     
        
    
     

    }
}