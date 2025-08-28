import java.util.*;
class add2{
    public static void main(String[] args) {
        LinkedList<Integer> x = new LinkedList<>();  //Type Safety By Compilor Erasor
        x.add("om");
        x.add(67);
        x.add(55.7);
        x.add(true);
        x.add(67.8f);
    
    System.out.println(x);
    x.add(2,"ragat");
        System.out.println(x); 
    
       
        }  }
//         add2.java:5: error: incompatible types: String cannot be converted to Integer
//         x.add("om");
//               ^
// add2.java:7: error: incompatible types: double cannot be converted to Integer
//         x.add(55.7);
//               ^
// add2.java:8: error: incompatible types: boolean cannot be converted to Integer
//         x.add(true);
//               ^
// add2.java:9: error: incompatible types: float cannot be converted to Integer
//         x.add(67.8f);
//               ^
// add2.java:12: error: incompatible types: String cannot be converted to Integer
//     x.add(2,"ragat");
//             ^
// Note: Some messages have been simplified; recompile with -Xdiags:verbose to get full output
// 5 errors