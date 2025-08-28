
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
class A {
 public static void main(String[] args) {
    
   Address addr = new Address();
        addr.city = "Jaipur";
        addr.state = "Rajasthan";
        
       student s = new student();
        s.name = "Gopal";
        s.age = 17;
        s.address = addr;
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
