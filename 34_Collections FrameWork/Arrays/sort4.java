import java.util.Arrays;
class sort4{
    public static void main (String[]args){
        Employee [] x={
        new Employee("prithvi",8),
        new Employee("agni",15),
        new Employee("pinaka",10),
        new Employee("aakash",17),
        new Employee("naag",7),
        new Employee("brahmos",12)
        };
        Arrays.sort(x);
         for(Employee next :x){
        System.out.print( next+ " ");
       }
        System.out.println();
    }
}
// Exception in thread "main" java.lang.ClassCastException: class Employee cannot be cast to class java.lang.Comparable (Employee is in unnamed module of loader 'app'; java.lang.Comparable is in module java.base of loader 'bootstrap')
//         at java.base/java.util.ComparableTimSort.countRunAndMakeAscending(ComparableTimSort.java:320)
//         at java.base/java.util.ComparableTimSort.sort(ComparableTimSort.java:188)
//         at java.base/java.util.Arrays.sort(Arrays.java:1041)
//         at sort4.main(sort4.java:12)