import java.io.File;
import java.io.FileReader;
import java.io.IOException;

class D {
    public static void main(String[] args) throws IOException {
        File file = new File("abc.txt");

        FileReader fr = new FileReader(file);

        int val = 0;
        while(val  != -1) 
            System.out.println((char)val);        
              fr.read();
        fr.close();
    }
}