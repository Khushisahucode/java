import java.util.*;
class abcd{
    public static void main(String[]args){
        ArrayList<String>names = new ArrayList<>();
        names.add("ravi");
        names.add("anjali");
        names.add("Soham");
        names.add("Priya");
        names.add("amit");
        names.get(3);   
        System.out.println(names);
Iterator<String>it=names.iterator(); 
System.out.println(it.hasNext());
  while(it.hasNext()){
    String elem= it.next();
    System.out.println(elem);
    if (elem.endsWith("i")){
        it.remove();
    }
}System.out.println(names);
 }
 }
// [ravi, Anjali, Soham, Priya, Amit]
// true
// ravi
// Anjali
// Soham
// Priya
// Amit
// [ravi, Soham, Priya]