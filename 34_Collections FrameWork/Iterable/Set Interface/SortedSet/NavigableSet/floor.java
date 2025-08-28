import java.util.TreeSet;
 class floor{
 public static void main(String[]args){
   TreeSet<String>set=new TreeSet <String>();
    set.add("khushi");
    set.add("vivek");
    set.add("aashvi");
    set.add("deepak"); 
    set.add("manoj");
    set.add("ruhi");
    System.out.println(set);
    System.out.println(set.floor("manoj"));
    System.out.println(set.floor("Ashvi"));
    System.out.println(set.floor("hitesh"));
}
  }
//  [aashvi, deepak, khushi, manoj, ruhi, vivek]
// manoj
// null
// deepak