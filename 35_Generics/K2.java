import java.util.ArrayList;
public class K2 {
    public static void main(String[] args) {
        ArrayList<Animal>p=new ArrayList<Animal>();
        livingbeing a=new dog();  Animal b=new cat(); Animal c=new cow(); Animal d=new Animal();
        p.add(b);
        p.add((dog)a);
         p.add(c);
        p.add(d);
        System.out.println(p);
    }
 }
// [cat@279f2327, dog@2ff4acd0, cow@54bedef2, Animal@5caf905d]