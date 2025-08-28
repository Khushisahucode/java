import java.util.*;
class remove_1 {
    public static void main(String[] args) {
        Vector<String> x= new Vector<>();
        x.add("mohan");
        x.add("sohan");
        x.add("rohan");
        x.add("gohan");
        x.add("tohan");
         System.out.println("Vector   is : "+x);
          for (int i = 0; i < x.size(); i++) {
          x.remove(i); }
          System.out.println("Vector  After removing is : "+x);}
}
// Vector   is : [mohan, sohan, rohan, gohan, tohan]
// Vector  After removing is : [sohan, gohan]