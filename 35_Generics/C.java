import java.util.ArrayList;
class C{
    public static void main(String[]args){
   ArrayList <Integer>x=new ArrayList<Integer>();
   x.add("khushi");
   x.add(23);
     x.add(34.67);
      x.add(true);
       x.add(238689898);
        x.add(56.78f);
        System.out.println(x);}
}
// c.java:5: error: incompatible types: String cannot be converted to Integer
//    x.add("khushi");
//          ^
// c.java:7: error: incompatible types: double cannot be converted to Integer
//      x.add(34.67);
//            ^
// c.java:8: error: incompatible types: boolean cannot be converted to Integer
//       x.add(true);
//             ^
// c.java:10: error: incompatible types: float cannot be converted to Integer
//         x.add(56.78f);
//               ^