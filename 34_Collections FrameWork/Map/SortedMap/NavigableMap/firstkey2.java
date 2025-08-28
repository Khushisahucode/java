import java.util.TreeMap;
public class firstkey2 {
   
    public static void main(String[] args) {
        TreeMap<User,college>x=new TreeMap<User,college>(); 
        x.put (new User("om",12),new college("HEC"));
      x.put (new User("ashvi",34),new college("BGIEM"));
      x.put (new User("vivek",10),new college("GGITS"));
      x.put (new User("uday",192),new college("SRIT"));
      x.put (new User("mohan",32),new college("BIOT"));
      System.out.println("first key is : "+x.firstKey());
     
    }
}
// Exception in thread "main" java.lang.ClassCastException: class User cannot be cast to class java.lang.Comparable (User is in unnamed module of loader 'app'; java.lang.Comparable is in module java.base of loader 'bootstrap')
//         at java.base/java.util.TreeMap.compare(TreeMap.java:1607)
//         at java.base/java.util.TreeMap.addEntryToEmptyMap(TreeMap.java:812)
//         at java.base/java.util.TreeMap.put(TreeMap.java:821)
//         at java.base/java.util.TreeMap.put(TreeMap.java:570)
//         at firstkey2.main(firstkey2.java:6)