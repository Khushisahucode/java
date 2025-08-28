import java.io.File;
import java.io.FileReader;
import java.io.IOException;

class E {
    public static void main(String[] args) throws IOException {
        File file = new File("golu.txt");
       file.createNewFile();
        FileReader fr = new FileReader(file);
       char [] arr=new char[6];
        int val = fr.read(arr);
        for(char next:arr){
          System.out.print(next);
        }
            
        fr.close();
    }
}//Thanks
