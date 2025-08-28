import java.util.Vector;
class C {

    public static void main(String[] args) {
        Vector x = new Vector();
        System.out.println("Vector : "+x);
        x.add(34);
        x.add(45);
        x.add(89);
        x.add(40);
        x.add(100);
        x.add(31);
        x.add(111);
        System.out.println(  "Vector : "+x);
    }
 }
// Vector : []
// Vector : [34, 45, 89, 40, 100, 31, 111]