import java.io.File;
import java.io.FileReader;
import java.io.IOException;
class H {
    public static void main(String[] args) throws IOException {
        File file = new File("sss.txt");
       file.createNewFile();
        FileReader fr = new FileReader(file);
       char [] arr=new char[4];int val=0;
    while(val!=-1){
        
        for(int i=0;i<val;i++){
          System.out.print(arr[i]);
          val=fr.read(arr);
        }
       
    }
        
        fr.close();
    }
}

