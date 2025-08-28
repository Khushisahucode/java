import java.util.NavigableSet;
import java.util.TreeSet;
 class headset2{
 public static void main(String[]args){
   TreeSet<String>set=new TreeSet <String>();
    set.add("khushi");
    set.add("vivek");
    set.add("aashvi");
    set.add("deepak"); 
    set.add("manoj");
    set.add("ruhi");
    System.out.println(set);
    NavigableSet x= set.headSet("manoj", true);
    System.out.println(x);
     NavigableSet y= set.headSet("ruhi", false);
    System.out.println(x);
    System.out.println(set.floor("hitesh"));
}
  }
//  [aashvi, deepak, khushi, manoj, ruhi, vivek]
// [aashvi, deepak, khushi, manoj]
// [aashvi, deepak, khushi, manoj]
// deepak