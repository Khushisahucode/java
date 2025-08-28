import java.util.ArrayList;
class G{
    public static void main(String[] args) {
        ArrayList x=new ArrayList();//warnings
        x.add("om");
        x.add(23);
        x.add(34.5f);
        System.out.println(x);
    }
}
// Note: G.java uses unchecked or unsafe operations.
// Note: Recompile with -Xlint:unchecked for details.
// [om, 23, 34.5]