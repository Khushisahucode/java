import java.util.ArrayList;
class A3{
    public static void main(String[]args){
   ArrayList x=new ArrayList();
   x.add("khushi");
   x.add(23);
   x.add(34.67);
   x.add(true);
   x.add(238689898);
   x.add(56.78f);
        System.out.println(x);
        String str= (String)x.get(0);
        System.out.println(str);
    
    }
    }
//     Note: A3.java uses unchecked or unsafe operations.
// Note: Recompile with -Xlint:unchecked for details.
// [khushi, 23, 34.67, true, 238689898, 56.78]
// khushi