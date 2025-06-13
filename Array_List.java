import java.util.ArrayList;
import java.util.Collections;
public class Array_List {
    public static void main(String[]args){
        ArrayList<String>arr=new ArrayList<>();
        arr.add("khushi");
       arr.add("rohit");
       arr.add("om");
       arr.add("madhu");
       System.out.println("before chanege "+ arr);
       arr.add(3,"aditya");
       System.out.println("after chanege "+ arr);
       arr.set(3,"rishabh");
       System.out.println(" arraylist is "+ arr);
       //arr.clear();
       arr.remove(2);  
       System.out.println(arr);
   arr.add("abhisek");
   arr.add("khushi");
arr.add("addi");
arr.add("aaru");
arr.add("Zehen");
Collections.sort(arr);
System.out.println("Array List : "+ arr);
 }
}
// output :
// before chanege [khushi, rohit, om, madhu]
// after chanege [khushi, rohit, om, aditya, madhu]
//  arraylist is [khushi, rohit, om, rishabh, madhu]
// [khushi, rohit, rishabh, madhu]
// Array List : [Zehen, aaru, abhisek, addi, khushi, khushi, madhu, rishabh, rohit]