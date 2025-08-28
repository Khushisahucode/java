import java.io.File;
import java.io.FileReader;
import java.io.IOException;
class G {
    public static void main(String[] args) throws IOException {
        File file = new File("sss.txt");
       file.createNewFile();
        FileReader fr = new FileReader(file);
       char [] arr=new char[4];int val=0;
    while((val=fr.read(arr))!=-1){
        
        for(int i=0;i<val;i++){
          System.out.print(arr[i]);
        }
       
    }
        
        fr.close();
    }
}
