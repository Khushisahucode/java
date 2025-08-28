
import java.util.ArrayList;
import java.util.Collections;

class sort3 {

    public static void main(String[] args) {
        ArrayList<Employee> x = new ArrayList<Employee>();
        x.add(new Employee("prithvi",8));
        x.add(new Employee("agni",15));
        x.add(new Employee("pinaka",10));
        x.add(new Employee("aakash",17));
        x.add(new Employee("naag",7));
        x.add(new Employee("brahmos",12));
       
        System.err.println("list is : " + x);
        Collections.sort(x);
        System.out.println("list is : " + x);
    }
}
// sort3.java:17: error: no suitable method found for sort(ArrayList<Employee>)
//         Collections.sort(x);
//                    ^
//     method Collections.<T#1>sort(List<T#1>) is not applicable
//       (inference variable T#1 has incompatible bounds
//         equality constraints: Employee
//         upper bounds: Comparable<? super T#1>)
//     method Collections.<T#2>sort(List<T#2>,Comparator<? super T#2>) is not applicable
//       (cannot infer type-variable(s) T#2
//         (actual and formal argument lists differ in length))
//   where T#1,T#2 are type-variables:
//     T#1 extends Comparable<? super T#1> declared in method <T#1>sort(List<T#1>)
//     T#2 extends Object declared in method <T#2>sort(List<T#2>,Comparator<? super T#2>)
// 1 error