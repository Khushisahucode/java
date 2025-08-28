
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
class A {
 public static void main(String[] args){
       
        try{
         File  file=new File("nakul.txt");
         FileInputStream fis=new FileInputStream(file);
         ObjectInputStream ois=new ObjectInputStream(fis);
         shape s=(shape) ois.readObject();
         ois.close();
         System.out.println(s.width);
           System.out.println(s.length);
             System.out.println(s.height);
        }
         catch(FileNotFoundException e){
            e.printStackTrace();
         }
         catch(IOException e){
            e.printStackTrace();
         }
         catch(ClassNotFoundException e){
            e.printStackTrace();
         }
         
    }
}
