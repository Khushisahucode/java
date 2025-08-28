
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
class A {
 public static void main(String[] args) {
    student s=new student();
    xaddress addr= new xaddress();
     addr.city="indore";
     addr.state="mp";
     s.name="khushi";
     s.age=22;
     s.address=addr;
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
