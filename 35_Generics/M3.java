import java.util.ArrayList;
public class M3 {
    public static void main(String[] args) {
        pro(info());
    }
       static ArrayList info(){
    ArrayList x=new ArrayList ();
        x.add("khushi");
        x.add(false);
        x.add(45.8);
        pro(x);
         return x;
    }
    
    static void  pro(ArrayList<Integer> y){
       y.add(56);
       y.add(32);
         y.add(996);
       y.add(22);
       System.out.println(y);
       //not ok
    //    y.add(94.78f);
    //    y.add("586");
    //    y.add(true);
    }
}
// Note: M3.java uses unchecked or unsafe operations.
// Note: Recompile with -Xlint:unchecked for details.
// [khushi, false, 45.8, 56, 32, 996, 22]
// [khushi, false, 45.8, 56, 32, 996, 22, 56, 32, 996, 22]