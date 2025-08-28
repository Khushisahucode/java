import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
class binarysearch4{
    public static void main(String[]args){
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
              Employee e= new Employee("prithvi",8);
     int index=   Collections.binarySearch(x,e,comp);
        System.out.println(x+ "\n"+"key found in index : "+ index);
          Comparator<Employee> comp2=new agedscsort();
   Collections.sort(x,comp2);
        System.out.println("list is : " + x);
              Employee e2= new Employee("naag",7);
     int index2=   Collections.binarySearch(x,e2,comp2);
        System.out.println(x+ "\n"+"key found in index : "+ index2);
        
    }}
// list is : [prithvi - 8, agni - 15, pinaka - 10, aakash - 17, naag - 7, brahmos - 12]
// list is : [prithvi - 8, pinaka - 10, naag - 7, brahmos - 12, agni - 15, aakash - 17]
// [prithvi - 8, pinaka - 10, naag - 7, brahmos - 12, agni - 15, aakash - 17]
// key found in index : 0
// list is : [aakash - 17, agni - 15, brahmos - 12, pinaka - 10, prithvi - 8, naag - 7]
// [aakash - 17, agni - 15, brahmos - 12, pinaka - 10, prithvi - 8, naag - 7]
// key found in index : 5