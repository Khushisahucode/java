import java.io.File;
import java.io.FileReader;
import java.io.IOException;

class C {
    public static void main(String[] args) throws IOException {
        File file = new File("abc.txt");

        FileReader fr = new FileReader(file);

        int val = 0;
        while((val = fr.read()) != -1) 
            System.out.println((char)val);        
        
        fr.close();
    }
}