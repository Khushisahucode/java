//duplicates are allowed
import java.util.LinkedList;
class C2 {
    public static void main(String[] args) {
        LinkedList x = new LinkedList();
        System.out.println("LinkedList : "+x);
        x.add("om");
        x.add("khushi");
        x.add("madhu");
        x.add("om");
        x.add("aadi");
        x.add("riya");
        x.add(127346575);
        System.out.println(  "LinkedList : "+x);
    }
}
