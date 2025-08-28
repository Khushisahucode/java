import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
class B{
    public static void main(String[]args)throws FileNotFoundException,IOException{
        File file=new File("abc.txt");
        if(!file.exists()){
            file.createNewFile();
        }
FileReader f=new FileReader(file);
     System.out.println(f.read());
   System.out.println(f.read());
     System.out.println(f.read());
       System.out.println(f.read());
    }
}
// 65
// 66
// 67
// 68