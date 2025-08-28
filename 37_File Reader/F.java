import java.io.File;
import java.io.FileReader;
import java.io.IOException;
class F {
    public static void main(String[] args) throws IOException {
        File file = new File("sss.txt");
       file.createNewFile();
        FileReader fr = new FileReader(file);
       char [] arr=new char[4];
        int val = fr.read(arr);
        for(char next:arr){
          System.out.print(next);
        }
          val = fr.read(arr);
          for(char next:arr){
          System.out.print(next);
        }
         val = fr.read(arr);
        for(char next:arr){
          System.out.print(next);
        }
          val = fr.read(arr);
        for(char next:arr){
          System.out.print(next);
        }  
        fr.close();
    }
}
//golu is a good g