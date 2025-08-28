import java.util.Arrays;
import java.util.Comparator;
class sort5{
    public static void main (String[]args){
        Employee [] x={
        new Employee("prithvi",8),
        new Employee("agni",15),
        new Employee("pinaka",10),
        new Employee("aakash",17),
        new Employee("naag",7),
        new Employee("brahmos",12)
        };
        Comparator<Employee> comp=new ageascsort();
        Arrays.sort(x,comp);
         for(Employee next :x){
        System.out.print( next+ " ");
       }
        System.out.println();
    }
}
// naag - 7 prithvi - 8 pinaka - 10 brahmos - 12 agni - 15 aakash - 17 