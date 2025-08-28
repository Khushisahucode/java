import java.util.TreeSet;
 class tailset{
 public static void main(String[]args){
   TreeSet<String>set=new TreeSet <String>();
    set.add("khushi");
    set.add("vivek");
    set.add("aashvi");
    set.add("deepak"); 
    set.add("manoj");
    set.add("ruhi");
    System.out.println(set);
    System.out.println(set.tailSet("manoj"));
    System.out.println(set.tailSet("hitesh"));
}
  }
//   [aashvi, deepak, khushi, manoj, ruhi, vivek]
// [manoj, ruhi, vivek]
// [khushi, manoj, ruhi, vivek]