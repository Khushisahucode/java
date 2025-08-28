
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
class A {
 public static void main(String[] args) {
    student s=new student();
    Address addr= new Address();
     addr.city="indore";
     addr.state="mp";
     s.name="khushi";
     s.age=22;
     s.address=addr;
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
// java.io.NotSerializableException: Address
//         at java.base/java.io.ObjectOutputStream.writeObject0(ObjectOutputStream.java:1201)
//         at java.base/java.io.ObjectOutputStream.defaultWriteFields(ObjectOutputStream.java:1586)
//         at java.base/java.io.ObjectOutputStream.writeSerialData(ObjectOutputStream.java:1543)
//         at java.base/java.io.ObjectOutputStream.writeOrdinaryObject(ObjectOutputStream.java:1452)
//         at java.base/java.io.ObjectOutputStream.writeObject0(ObjectOutputStream.java:1195)
//         at java.base/java.io.ObjectOutputStream.writeObject(ObjectOutputStream.java:359)
//         at A.main(A.java:17)