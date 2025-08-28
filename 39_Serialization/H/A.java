
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
class A {
 public static void main(String[] args) {
    student s=new student();
    s.name="om";
    s.age= 22;
    s.college="jec";
    s.marks=89f;
    
      try{
       new  ObjectOutputStream(new FileOutputStream("bheem.txt")).writeObject(s);
        }
         catch(FileNotFoundException e){
            e.printStackTrace();
         }
         catch(IOException e){
            e.printStackTrace();
         } }
}
