import java.io.File;
import java.io.IOException;
class X4{
    public static void main(String[]args) throws IOException{
     File file=new File("C:/Users/sahuj/bheem.txt");
      boolean x=file.delete();
     System.out.println("Is file deleted ?  "+x);//false
      }
}
