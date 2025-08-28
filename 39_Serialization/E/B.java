
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
class B {
 public static void main(String[] args) throws IOException,ClassNotFoundException {
   student s=(student)(new  ObjectInputStream(new FileInputStream("bheem.txt")).readObject());
       System.out.println(s.age);
      System.out.println(s.name);
      System.out.println(s.address.city);
      System.out.println(s.address.state);
      }
}
//     22
// khushi
// indore
// mp     