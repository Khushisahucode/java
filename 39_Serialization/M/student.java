import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
class student implements Serializable {
    String name;
    int age;
   transient Address address;
  private void writeObject(ObjectOutputStream oos){
try {
    oos.defaultWriteObject();
    oos.writeObject(address.city.cityname);
     oos.writeObject(address.state.statename);
} catch (IOException e) { e.printStackTrace();
}
  }
 
  private void readObject(ObjectInputStream ois){
  try {
      ois.defaultReadObject();
      address =new Address();
       address.city=new City();  address.state=new State();
      address.city.cityname=(String)ois.readObject();
 address.state.statename=(String)ois.readObject();

  } catch (ClassNotFoundException e) { e.printStackTrace();
  } catch(IOException e){e.printStackTrace();}
  }
   
}
