import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
class B {
 public static void main(String[] args){
      
       
        try {
             ObjectInputStream ois=new ObjectInputStream(new FileInputStream("bheem.txt"));
       Student x=(Student) ois.readObject();
       System.out.println(x);
         Student y=(Student) ois.readObject();
          
           System.out.println(y);
            
             
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