import java.util.Comparator;
import java.util.TreeMap;
public class lastkey2 {
    public static void main(String[] args) {
        Comparator<User> comp=new namedscsort();
        TreeMap<User,college>x=new TreeMap<User,college>(comp); 
        x.put (new User("om",12),new college("HEC"));
      x.put (new User("ashvi",34),new college("BGIEM"));
      x.put (new User("vivek",10),new college("GGITS"));
      x.put (new User("uday",192),new college("SRIT"));
      x.put (new User("mohan",32),new college("BIOT"));
      System.out.println("last key is : "+x.lastKey());}
}
// last key is : ashvi-34