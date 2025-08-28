import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class E{
    public static void main(String[]args) throws IOException{
        File file=new File("xyz.txt");//xyz.txt  does not exist
        FileWriter fr=new FileWriter(file);
         String str="Chemistry gave moral you that  for creating new bonds we should break old bonds and remove them in life";
        char []arr=new char[4];
        int j=0;
        while(j<str.length()){ int i=0;
           for ( i = 0; i < arr.length; i++) {
            arr[i]=str.charAt(j);
            j++;
            if (j==str.length()) {
                break; }
                 
            } 
         //  fr.write(arr);

           if(i==4){
              fr.write(arr);
           }else{
     for (int k = 0; k<=i; k++) {
         fr.write(arr[k]);
     }
           }
        }
        
      fr.flush();
     fr.close();
    }
}