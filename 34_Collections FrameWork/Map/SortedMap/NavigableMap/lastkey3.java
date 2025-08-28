import java.util.TreeMap;
public class lastkey3 {
     public static void main(String[] args) {
        TreeMap<String,Integer>x=new TreeMap<String,Integer>(); 
        x.put ("om",12);
      x.put ("ashvi",34);
      x.put ("vivek",10);
      x.put ("uday",192);
      x.put ("mohan",32);
      System.out.println("last key is : "+x.lastKey());
     
    }
}
// last key is : vivek