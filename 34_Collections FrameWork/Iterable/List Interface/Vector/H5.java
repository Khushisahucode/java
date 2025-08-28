import java.util.*;
class H5{
    public static void main(String[] args) {
        Vector x = new Vector();
        x.add("om");
        x.add("khushi");
        x.add("madhu");
        x.add("om");
        x.add("aadi");
        x.add("riya");
        x.add("om");
        Iterator x1 = x.iterator();
     for (String next:x) {
          System.out.println(  next); }
       }
}
// H5.java:13: error: incompatible types: Object cannot be converted to String
//      for (String next:x) {
//                       ^
// Note: H5.java uses unchecked or unsafe operations.
// Note: Recompile with -Xlint:unchecked for details.
// 1 error