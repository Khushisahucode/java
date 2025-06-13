import java.util.*;
class abcd2{
    public static void main(String[]args){
        ArrayList<String>names = new ArrayList<>();
        names.add("ravi");
        names.add("anjali");  
        names.add("Soham");
        names.add("Priya");
        names.add("amit");
        ListIterator<String>it=names.listIterator();
 while(it.hasNext()){
   String elem=it.next();
    if(elem.length()<=4){
        it.set("bye");}}
    System.out.println(names);
    
int count=0;
while(it.hasPrevious()){
  String x=it.previous();
  count++;
  if(count!= names.size()){
    it.set("hello");
   }
}
 System.out.println(names);
}
  }
// [bye, anjali, Soham, Priya, bye]
// [bye, hello, hello, hello, hello]

