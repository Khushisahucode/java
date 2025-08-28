import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
class A {
 public static void main(String[] args){
      
     Student s2=new Student();
        s2.name="aadi";
        s2.age=33;
        s2.marks=27;
        
        try {
             ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("bheem.txt"));
       
        oos.writeObject(s2);
    

        } catch (FileNotFoundException e) { e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();}
      

    }
}
