import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
class sort4 {
        public static void main(String[] args) {
        ArrayList<Employee> x = new ArrayList<Employee>();
        x.add(new Employee("prithvi",8));
        x.add(new Employee("agni",15));
        x.add(new Employee("pinaka",10));
        x.add(new Employee("aakash",17));
        x.add(new Employee("naag",7));
        x.add(new Employee("brahmos",12));
         Comparator<Employee> comp=new namedscsort();
        System.err.println("list is : " + x);
        Collections.sort(x,comp);
        System.out.println("list is : " + x);
    }
 }
// list is : [prithvi - 8, agni - 15, pinaka - 10, aakash - 17, naag - 7, brahmos - 12]
// list is : [prithvi - 8, pinaka - 10, naag - 7, brahmos - 12, agni - 15, aakash - 17]