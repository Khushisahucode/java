import java.util.ArrayList;
public class N6 {
    public static void main(String[] args) {
        ArrayList< Integer> x=new ArrayList <>();
         x.add(56);
         x.add(32);
         x.add(996);
         x.add(22);
          ArrayList< Float> x2=new ArrayList <>();
         pro(x);
         pro(x2);
        System.out.println(x);
    }
    static void  pro(ArrayList< Integer> y){
       // problm 1
        for(Object next:y){

       }}
    static void  pro(ArrayList< Float> y){
       //problm 2
    //       y.add(94.78f);
    //   y.add(45.67);
    //    y.add(459438763);
    //     y.add(32);
    //      y.add(996);
    //      y.add(22); 
}}
// N6.java:19: error: name clash: pro(ArrayList<Float>) and pro(ArrayList<Integer>) have the same erasure
//     static void  pro(ArrayList< Float> y){
//                  ^
// 1 error