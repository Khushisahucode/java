import java.util.TreeMap;
public class firstkey {
   
    public static void main(String[] args) {
        TreeMap<student,college>x=new TreeMap<student,college>(); 
        x.put (new student("om",12),new college("HEC"));
      x.put (new student("ashvi",34),new college("BGIEM"));
      x.put (new student("vivek",10),new college("GGITS"));
      x.put (new student("uday",192),new college("SRIT"));
      x.put (new student("mohan",32),new college("BIOT"));
      System.out.println("first key is : "+x.firstKey());
     
    }
}
//first key is : ashvi-34