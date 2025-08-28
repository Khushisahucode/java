import java.util.Vector;
class D {
    public static void main(String[] args) {
        Vector x = new Vector();
        System.out.println("Vector  size : "+x.size());
        x.add("om");
        x.add("khushi");
        x.add("madhu");
        x.add("om");
        x.add("aadi");
        x.add("riya");
        x.add(127346575);
        System.out.println(  "Vector size: "+x.size());
    }
}
// Vector  size : 0
// Vector size: 7