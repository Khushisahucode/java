import java.io.File;
import java.io.IOException;
class X2{
    public static void main(String[]args) throws IOException{
    
      File file=new File("P");//empty folder
      
     boolean x=file.delete();
      
      
      System.out.println("Is file deleted ?  "+x);//true
     
        
    
     

    }
}