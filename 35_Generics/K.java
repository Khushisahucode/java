import java.util.ArrayList;
public class K {
    public static void main(String[] args) {
        ArrayList<Animal>p=new ArrayList<dog>();
        Animal a=new dog();  Animal b=new cat(); Animal c=new cow(); Animal d=new Animal();
        p.add(b);
        p.add(a);
         p.add(c);
        p.add(d);
        System.out.println(p);
    }
}
// K.java:4: error: incompatible types: ArrayList<dog> cannot be converted to ArrayList<Animal>
//         ArrayList<Animal>p=new ArrayList<dog>();
//                            ^
// 1 error