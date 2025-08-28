import java.util.Comparator;
import java.util.TreeMap;
public class tailmap {
    public static void main(String[] args) {
        Comparator<User> comp=new namedscsort();
        TreeMap<User,college>x=new TreeMap<User,college>(comp); 
        x.put (new User("om",12),new college("HEC"));
      x.put (new User("ashvi",34),new college("BGIEM"));
      x.put (new User("vivek",10),new college("GGITS"));
      x.put (new User("uday",192),new college("SRIT"));
      x.put (new User("mohan",32),new college("BIOT"));
      System.out.println("Map is : "+x);
      User u=new User("om",10);
    System.out.println(x.tailMap(u));
    User u2=new User("nitin",10);
    System.out.println(x.tailMap(u2));
     User u3=new User("ashvi",10);
    System.out.println(x.tailMap(u3));
}
}
// Map is : {vivek-10=GGITS, uday-192=SRIT, om-12=HEC, mohan-32=BIOT, ashvi-34=BGIEM}
// {om-12=HEC, mohan-32=BIOT, ashvi-34=BGIEM}
// {mohan-32=BIOT, ashvi-34=BGIEM}
// {ashvi-34=BGIEM}