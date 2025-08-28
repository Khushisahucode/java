import java.util.Comparator;
public class nameascsort implements Comparator<Employee>{
     public  int compare(Employee a,Employee b){
         return a.name.compareTo(b.name);
     }
}
