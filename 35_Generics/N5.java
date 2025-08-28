import java.util.ArrayList;
public class N5 {
    public static void main(String[] args) {
        ArrayList< Integer> x=new ArrayList <>();
         x.add(56);
         x.add(32);
         x.add(996);
         x.add(22);
         pro(x);
        System.out.println(x);
    }
    static void  pro(ArrayList< ? extends Number> y){
       for(Number next:y){
             System.out.println(next);
       }
       //not ok
    //       y.add(94.78f);
    //   y.add(45.67);
    //    y.add(459438763);
    //     y.add(32);
    //      y.add(996);
    //      y.add(22);
       System.out.println(y);
       
    
    }
}
//56
// 32
// 996
// 22
// [56, 32, 996, 22]
// [56, 32, 996, 22]