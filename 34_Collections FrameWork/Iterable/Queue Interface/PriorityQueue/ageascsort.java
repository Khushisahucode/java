import java.util.Comparator;
public class ageascsort implements Comparator<Employee>{
     public  int compare(Employee a,Employee b){
         return a.age.compareTo(b.age);
     }
}
