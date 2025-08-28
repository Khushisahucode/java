import java.util.*;
class remove_1 {
    public static void main(String[] args) {
        LinkedList<String> x= new LinkedList<>();
        x.add("mohan");
        x.add("sohan");
        x.add("rohan");
        x.add("gohan");
        x.add("tohan");
         System.out.println("LinkedList   is : "+x);
          for (int i = 0; i < x.size(); i++) {
          x.remove(i); }
          System.out.println("LinkedList  After removing is : "+x);}
}
// LinkedList   is : [mohan, sohan, rohan, gohan, tohan]
// LinkedList  After removing is : [sohan, gohan]