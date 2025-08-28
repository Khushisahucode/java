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
// 0.0