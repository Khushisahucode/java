import java.util.TreeSet;
import java.util.NavigableSet;
 class ceiling{
 public static void main(String[]args){
   TreeSet<String>set=new TreeSet <String>();
    set.add("khushi");
    set.add("vivek");
    set.add("aashvi");
    set.add("deepak"); 
    set.add("manoj");
    set.add("ruhi");
    System.out.println(set);
    System.out.println(set.ceiling("manoj"));
    System.out.println(set.ceiling("yash"));
    System.out.println(set.ceiling("hitesh"));
}
  }
// [aashvi, deepak, khushi, manoj, ruhi, vivek]
// manoj
// null
// khushi