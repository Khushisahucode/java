import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
class B {
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
             ObjectInputStream ois=new ObjectInputStream(new FileInputStream("bheem.txt"));
       Student x=(Student) ois.readObject();
         Student y=(Student) ois.readObject();
           Student z=(Student) ois.readObject(); ois.close();
           System.out.println(x);
            System.out.println(y);
             System.out.println(z);
        } catch (FileNotFoundException e) { e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();}
            catch(ClassNotFoundException e){
                e.printStackTrace();
            }
       

    }
}
// rishabh ...30....87.0
// aadi ...33....27.0
// om ...12....79.0