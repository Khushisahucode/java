import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
class B {
 public static void main(String[] args) throws IOException,ClassNotFoundException {
   student s=(student)(new  ObjectInputStream(new FileInputStream("bheem.txt")).readObject());
       System.out.println(s.age);
      System.out.println(s.name);
      System.out.println(s.address);
      System.out.println(s.address);
      }
}
// 17
// Gopal
// null
// null