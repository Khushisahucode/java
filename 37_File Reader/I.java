import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
class I{
    public static void main(String[] args) throws IOException {
        File file = new File("aman.txt");
       file.createNewFile();
       FileReader fr= new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String str= br.readLine();
        System.out.println(str);
        fr.close();}
    }
//Aman is a good boy...

