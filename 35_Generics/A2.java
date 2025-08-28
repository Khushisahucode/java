import java.util.ArrayList;
class A2{
    public static void main(String[]args){
   ArrayList x=new ArrayList();
   x.add("khushi");
   x.add(23);
   x.add(34.67);
   x.add(true);
   x.add(238689898);
   x.add(56.78f);
        System.out.println(x);
        String str=x.get(0);
        System.out.println(str);
    
    }
    }
//     A2.java:12: error: incompatible types: Object cannot be converted to String
//         String str=x.get(0);
//                         ^
// Note: A2.java uses unchecked or unsafe operations.
// Note: Recompile with -Xlint:unchecked for details.
// 1 error