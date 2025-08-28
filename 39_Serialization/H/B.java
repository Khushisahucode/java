import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
class B {
 public static void main(String[] args)  {
  try{
    FileInputStream fis=new FileInputStream("bheem.txt");
    ObjectInputStream ois=new ObjectInputStream(fis);

   student s=(student)ois.readObject();
       System.out.println(s.age);
      System.out.println(s.name);
      System.out.println(s.college);
      System.out.println(s.marks);
   ois.close();
      } catch(FileNotFoundException e){
         e.printStackTrace();}
    
catch(ClassNotFoundException e){
         e.printStackTrace();
  }
catch(IOException e){
  e.printStackTrace();
}
}}
// 0
// null
// jec
// 89.0