import java.util.ArrayList;
public class M1 {
    public static void main(String[] args) {
        ArrayList< Integer> x=new ArrayList <>();
         x.add(56);
         x.add(32);
         x.add(996);
         x.add(22);
        //not ok
        // x.add("khushi");
        // x.add(false);
        // x.add(45.8);
        pro(x);
        System.out.println(x);
    }
    static void  pro(ArrayList y){
          y.add(94.78f);
      y.add("khushi");
       y.add(true);
       System.out.println(y);
       
    
    }
}
// [56, 32, 996, 22, 94.78, khushi, true]
// [56, 32, 996, 22, 94.78, khushi, true