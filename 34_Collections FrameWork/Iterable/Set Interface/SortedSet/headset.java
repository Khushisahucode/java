import java.util.TreeSet;
 class headset{
 public static void main(String[]args){
   TreeSet<String>set=new TreeSet <String>();
    set.add("khushi");
    set.add("vivek");
    set.add("aashvi");
    set.add("deepak"); 
    set.add("manoj");
    set.add("ruhi");
    System.out.println(set);
    System.out.println(set.headSet("manoj"));
    System.out.println(set.headSet("hitesh"));
}
  }
// [aashvi, deepak, khushi, manoj, ruhi, vivek]
// [aashvi, deepak, khushi]
// [aashvi, deepak]