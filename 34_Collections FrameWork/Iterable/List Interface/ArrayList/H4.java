import java.util.*;
class H4 {
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
          System.out.println(  next.toString()); }
       }
}
// om
// khushi
// madhu
// om
// aadi
// riya
// om
