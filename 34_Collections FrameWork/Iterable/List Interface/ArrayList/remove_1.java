import java.util.*;
class remove_1 {
    public static void main(String[] args) {
        ArrayList<String> x= new ArrayList<>();
        x.add("mohan");
        x.add("sohan");
        x.add("rohan");
        x.add("gohan");
        x.add("tohan");
         System.out.println("ArrayList   is : "+x);
          for (int i = 0; i < x.size(); i++) {
          x.remove(i); }
          System.out.println("ArrayList  After removing is : "+x);}
}
// ArrayList   is : [mohan, sohan, rohan, gohan, tohan]
// ArrayList  After removing is : [sohan, gohan]