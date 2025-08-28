import java.util.*;
class H2 {
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
        while(x1.hasNext()){
        System.out.println(  x1.next()); }
}
}
// om
// khushi
// madhu
// om
// aadi
// riya
// om