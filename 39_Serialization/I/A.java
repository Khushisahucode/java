import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
public class A {
    public static void main(String[]args){
        student s=new student();
        s.name="mukul";
        s.age=18;
        s.marks=34.6f;
        try {
            FileOutputStream fos=new FileOutputStream("jay.txt");
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            oos.writeObject(s);
            oos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
