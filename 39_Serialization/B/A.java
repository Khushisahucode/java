
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


class A {

    public static void main(String[] args){
        shape s=new shape();
        s.length=34;
        s.width=32;
        s.height=12;
        try{
         File  file=new File("nakul.txt");
         FileOutputStream fos=new FileOutputStream(file);
         ObjectOutputStream oos=new ObjectOutputStream(fos);
         oos.writeObject(s);
         oos.close();
        }
         catch(FileNotFoundException e){
            e.printStackTrace();
         }
         catch(IOException e){
            e.printStackTrace();
         }
         
    }
}
