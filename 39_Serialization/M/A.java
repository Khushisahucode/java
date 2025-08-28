
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
class A {
 public static void main(String[] args) {
   City city=new City(); //State state=new State();
    city.cityname="jaipur";
    State state=new State();
      state.statename="rajsthan";
 Address addr=new Address();
    addr.city=city;
    addr.state=state;
   student s=new student();
    s.name="khushi";
     s.age=22;
     s.address=addr;
      try{
      ObjectOutputStream oos= new  ObjectOutputStream(new FileOutputStream("bheem.txt"));
      oos.writeObject(s);
        }
         catch(FileNotFoundException e){
            e.printStackTrace();
         }
         catch(IOException e){
            e.printStackTrace();
         } }
}
