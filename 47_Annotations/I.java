import java.util.ArrayList;

class I {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        ArrayList x = new ArrayList();
          x.add(12);
        x.add(34);
        x.add(67);
 System.out.println(x);
    }    

    static void pro() {
        ArrayList x = new ArrayList();
         x.add(12);
        x.add(34);
        x.add(67);

        System.out.println(x);
    }
}
// Note: I.java uses unchecked or unsafe operations.
// Note: Recompile with -Xlint:unchecked for details.
// [12, 34, 67]