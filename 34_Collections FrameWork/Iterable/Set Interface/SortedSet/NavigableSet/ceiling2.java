import java.util.NavigableSet;
import java.util.TreeSet;
 class ceiling2{
 public static void main(String[]args){
   TreeSet<Integer>set=new TreeSet <Integer>();
    set.add(2);
    set.add(12);
    set.add(62);
    set.add(18); 
    set.add(41);
    set.add(39);
    System.out.println(set);
    System.out.println(set.ceiling(45));
    System.out.println(set.ceiling(39));
}
  }
//   [2, 12, 18, 39, 41, 62]
// 62
// 39