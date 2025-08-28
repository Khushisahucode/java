import java.util.ArrayList;
public class N4 {
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
       for(Integer next:y){

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
// N4.java:13: error: incompatible types: CAP#1 cannot be converted to Integer
//        for(Integer next:y){
//                         ^
//   where CAP#1 is a fresh type-variable:
//     CAP#1 extends Number from capture of ? extends Number
// 1 error