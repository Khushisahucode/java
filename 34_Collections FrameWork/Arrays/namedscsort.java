import java.util.Comparator;
public class namedscsort implements Comparator<Employee>{
     public  int compare(Employee a,Employee b){
         return b.name.compareTo(a.name);
     }
}

