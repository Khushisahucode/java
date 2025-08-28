import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
public class B {
    public static void main(String[]args){
       
        try {
            FileInputStream fos=new FileInputStream("jay.txt");
            ObjectInputStream oos=new ObjectInputStream(fos);
            student s=(student)oos.readObject();
            oos.close();
            System.out.println(s.name);
            System.out.println(s.age);
            System.out.println(s.marks);
            System.out.println(s.college);
        } catch (FileNotFoundException e) {
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
// mukul
// 18
// 75.8
// global