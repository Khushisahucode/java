import java.util.*;
class H7{
    public static void main(String[] args) {
        LinkedList x = new LinkedList();
        x.add("om");
        x.add("khushi");
        x.add("madhu");
        x.add("om");
        x.add("aadi");
        x.add("riya");
        x.add("om");
        Iterator x1 = x.iterator();
     for (Object next:x) {
          System.out.println(((String)next).length()); }
       }
}
// 2
// 6
// 5
// 2
// 4
// 4
// 2