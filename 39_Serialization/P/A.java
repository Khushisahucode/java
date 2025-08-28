import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
class A {
 public static void main(String[] args){
        Student s1=new Student();
        s1.name="rishabh";
        s1.age=30;
        s1.marks=87;
      Employee e1=new Employee();
      e1.name="ganesh";
      e1.salary=25000f;
      e1.ratings=8.5f;
        try {
             ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("bheem.txt"));
        oos.writeObject(s1);
        oos.writeObject(e1);


        } catch (FileNotFoundException e) { e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();}
      

    }
}
