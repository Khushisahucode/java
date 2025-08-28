import java.util.*;
class H6{
    public static void main(String[] args) {
        ArrayList x = new ArrayList();
        x.add("om");
        x.add("khushi");
        x.add("madhu");
        x.add("om");
        x.add("aadi");
        x.add("riya");
        x.add("om");
        Iterator x1 = x.iterator();
     for (Object next:x) {
          System.out.println(  next.length()); }
       }
}
// rrayList\" ; if ($?) { javac H6.java } ; if ($?) { java H6 }
// H6.java:14: error: cannot find symbol
//           System.out.println(  next.length()); }
//                                    ^
//   symbol:   method length()
//   location: variable next of type Object
// Note: H6.java uses unchecked or unsafe operations.
// Note: Recompile with -Xlint:unchecked for details.
// 1 error