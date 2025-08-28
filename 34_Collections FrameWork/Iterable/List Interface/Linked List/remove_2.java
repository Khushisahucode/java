import java.util.*;
class remove_2 {
    public static void main(String[] args) {
        LinkedList<String> x= new LinkedList<>();
        x.add("mohan");
        x.add("sohan");
        x.add("rohan");
        x.add("gohan");
        x.add("tohan");
        int sz=x.size();
         System.out.println("LinkedList   is = "+x);
          for (int i = 0; i < sz; i++) {
          x.remove(i); }
       
  System.out.println("LinkedList  After removing is = "+x);}
}
// LinkedList   is = [mohan, sohan, rohan, gohan, tohan]
// Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Array index out of range: 3
//         at java.base/java.util.LinkedList.remove(LinkedList.java:844)
//         at remove_2.main(remove_2.java:13)