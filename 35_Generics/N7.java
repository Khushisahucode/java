import java.util.ArrayList;
public class N7 {
    public static void main(String[] args) {
        ArrayList< Integer> x=new ArrayList <>();
         x.add(56);
         x.add(32);
         x.add(996);
         x.add(22);
          ArrayList< Float> x2=new ArrayList <>();
           x2.add(56.8f);
         x2.add(3.2f);
         x2.add(9.96f);
         x2.add(22f);
         pro(x);
         pro(x2);
        System.out.println(x);
    }
    static void  pro(ArrayList< ? extends Number> y){

        System.out.println(y.remove(0));
    }
    
}
// 56
// 56.8
// [32, 996, 22]