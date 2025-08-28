import java.util.*;
class remove_3 {
    public static void main(String[] args) {
        Vector<String> x= new Vector<>();
        x.add("mohan");
        x.add("sohan");
        x.add("rohan");
        x.add("gohan");
        x.add("tohan");
        int sz=x.size();
        System.out.println( "Vector is : "+x);
          for (int i = 0; i < sz; i++) {
          x.remove(0); }
       
 System.out.println("Vector  After removing is : "+x);
}
}
// Vector is : [mohan, sohan, rohan, gohan, tohan]
// Vector  After removing is : []