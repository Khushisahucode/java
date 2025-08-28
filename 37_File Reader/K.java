import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
class K{
    public static void main(String[] args) throws IOException {
        File file = new File("khushi.txt");
       file.createNewFile();
       FileReader fr= new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String str= br.readLine();
        while(str!=null){
          System.out.println(str);
        str= br.readLine();   
        }
     fr.close();}
    }
//     hello guys myself!! khushi i am persuing B.Tech at BGIEM Jabalpur
// I am well skilled in programming language like java,c++,HTML
// last semester i scored 8.2 SGPA