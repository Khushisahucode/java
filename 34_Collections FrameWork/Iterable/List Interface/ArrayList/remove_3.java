import java.util.*;
class remove_3 {
    public static void main(String[] args) {
        ArrayList<String> x= new ArrayList<>();
        x.add("mohan");
        x.add("sohan");
        x.add("rohan");
        x.add("gohan");
        x.add("tohan");
        int sz=x.size();
        System.out.println( "ArrayList is : "+x);
          for (int i = 0; i < sz; i++) {
          x.remove(0); }
       
 System.out.println("ArrayList  After removing is : "+x);
}
}
// ArrayList is : [mohan, sohan, rohan, gohan, tohan]
// ArrayList  After removing is : []