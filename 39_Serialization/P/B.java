import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
class B {
 public static void main(String[] args){
        
        try {
             ObjectInputStream ois=new ObjectInputStream(new FileInputStream("bheem.txt"));
       Employee x=(Employee) ois.readObject();
         Student y=(Student) ois.readObject();
           ois.close();
           System.out.println(x);
            System.out.println(y);
             
        } catch (FileNotFoundException e) { e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();}
            catch(ClassNotFoundException e){
                e.printStackTrace();
            }
       

    }
}
// Exception in thread "main" java.lang.ClassCastException: class Student cannot be cast to class Employee (Student and Employee are in unnamed module of loader 'app')
//         at B.main(B.java:10)