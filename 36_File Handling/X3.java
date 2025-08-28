import java.io.File;
import java.io.IOException;
class X3{
    public static void main(String[]args) throws IOException{
     File file=new File("Q");//Not Empty folder
      boolean x=file.delete();
     System.out.println("Is file deleted ?  "+x);//false
      }
}
