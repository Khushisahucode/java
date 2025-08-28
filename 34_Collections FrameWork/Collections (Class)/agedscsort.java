
    
import java.util.Comparator;
public class agedscsort implements Comparator<Employee>{
     public  int compare(Employee a,Employee b){
         return b.age.compareTo(a.age);
     }
}

