import java.util.ArrayList;
public class K1 {
    public static void main(String[] args) {
        ArrayList<Animal>p=new ArrayList<Animal>();
        livingbeing a=new dog();  Animal b=new cat(); Animal c=new cow(); Animal d=new Animal();
        p.add(b);
        p.add(a);
         p.add(c);
        p.add(d);
        System.out.println(p);
    }
}
// PS D:\Java Coaching Code\35_Generics> cd "d:\Java Coaching Code\35_Generics\" ; if ($?) { javac K1.java } ; if ($?) { java K1 }
// K1.java:7: error: incompatible types: livingbeing cannot be converted to Animal
//         p.add(a);
//               ^
// Note: Some messages have been simplified; recompile with -Xdiags:verbose to get full output
// 1 error