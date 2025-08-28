import java.util.ArrayList;
public class P {
    public static void main(String[] args) {
        ArrayList<  ? extends bdog >list=new ArrayList<Object>();
        ArrayList<  ? extends bdog >list2=new ArrayList<Animal>();
        ArrayList<  ? extends bdog >list3=new ArrayList<livingbeing>();
        ArrayList<  ? extends bdog >list4=new ArrayList<dog>();
       
               
    }
}
// P.java:4: error: incompatible types: ArrayList<Object> cannot be converted to ArrayList<? extends bdog>
//         ArrayList<  ? extends bdog >list=new ArrayList<Object>();
//                                          ^
// P.java:5: error: incompatible types: ArrayList<Animal> cannot be converted to ArrayList<? extends bdog>
//         ArrayList<  ? extends bdog >list2=new ArrayList<Animal>();
//                                           ^
// P.java:6: error: incompatible types: ArrayList<livingbeing> cannot be converted to ArrayList<? extends bdog>
//         ArrayList<  ? extends bdog >list3=new ArrayList<livingbeing>();
//                                           ^
// P.java:7: error: incompatible types: ArrayList<dog> cannot be converted to ArrayList<? extends bdog>
//         ArrayList<  ? extends bdog >list4=new ArrayList<dog>();
//                                           ^
// 4 errors