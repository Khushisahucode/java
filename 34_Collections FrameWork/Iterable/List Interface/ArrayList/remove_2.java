import java.util.*;
class remove_2 {
    public static void main(String[] args) {
        ArrayList<String> x= new ArrayList<>();
        x.add("mohan");
        x.add("sohan");
        x.add("rohan");
        x.add("gohan");
        x.add("tohan");
        int sz=x.size();
         System.out.println("ArrayList   is : "+x);
          for (int i = 0; i < sz; i++) {
          x.remove(i); }
       
  System.out.println("ArrayList  After removing is : "+x);}
}
// Exception in thread "main" java.lang.IndexOutOfBoundsException: Index 3 out of bounds for length 2
//         at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:100)
//         at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:106)
//         at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:302)
//         at java.base/java.util.Objects.checkIndex(Objects.java:365)
//         at java.base/java.util.ArrayList.remove(ArrayList.java:552)
//         at remove_2.main(remove_2.java:12)
