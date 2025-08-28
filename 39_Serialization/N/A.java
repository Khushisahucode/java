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
     Student s2=new Student();
        s2.name="aadi";
        s2.age=33;
        s2.marks=27;
         Student s3=new Student();
        s3.name="om";
        s3.age=12;
        s3.marks=79;
        try {
             ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("bheem.txt"));
        oos.writeObject(s1);
        oos.writeObject(s2);
        oos.writeObject(s3);

        } catch (FileNotFoundException e) { e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();}
      

    }
}
