//duplicates are allowed
import java.util.ArrayList;
class C2 {
    public static void main(String[] args) {
        ArrayList x = new ArrayList();
        System.out.println("ArrayList : "+x);
        x.add("om");
        x.add("khushi");
        x.add("madhu");
        x.add("om");
        x.add("aadi");
        x.add("riya");
        x.add(127346575);
        System.out.println(  "ArrayList : "+x);
    }
}
