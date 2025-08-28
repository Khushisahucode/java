import java.util.Vector;
class C1 {
    public static void main(String[] args) {
        Vector x = new Vector();
        System.out.println("Vector : "+x);
        x.add("om");
        x.add(45.90);
        x.add(89.7f);
        x.add(true);
        x.add(100);
        x.add('A');
        x.add(127346575);
        System.out.println(  "Vector : "+x);
    }
}
