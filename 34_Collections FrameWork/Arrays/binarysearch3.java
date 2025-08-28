import java.util.Arrays;
import java.util.Comparator;
class binarysearch3{
    public static void main (String[]args){
        Employee [] x={
        new Employee("prithvi",8),
        new Employee("agni",15),
        new Employee("pinaka",10),
        new Employee("aakash",17),
        new Employee("naag",7),
        new Employee("brahmos",12)};
        Comparator<Employee> comp=new ageascsort();
        Arrays.sort(x,comp);
        for(Employee next :x){
        System.out.print( next+ " ");}
        System.out.println();
     int n=Arrays.binarySearch(x,new Employee("aakash",17));
    System.out.println("key found in index :"+ n); }
    }
// naag - 7 prithvi - 8 pinaka - 10 brahmos - 12 agni - 15 aakash - 17 
// Exception in thread "main" java.lang.ClassCastException: class Employee cannot be cast to class java.lang.Comparable (Employee is in unnamed module of loader 'app'; java.lang.Comparable is in module java.base of loader 'bootstrap')
//         at java.base/java.util.Arrays.binarySearch0(Arrays.java:2232)
//         at java.base/java.util.Arrays.binarySearch(Arrays.java:2174)
//         at binarysearch3.main(binarysearch3.java:17)