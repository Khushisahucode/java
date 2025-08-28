import java.util.*;
class O2{
    public static void main(String[] args) {
        ArrayList<HashSet <TreeMap<PriorityQueue<TreeSet>,Integer> >> x= new ArrayList<HashSet <TreeMap<PriorityQueue<TreeSet>,Integer> >>();
         HashSet<TreeMap<PriorityQueue<TreeSet>,Integer>> a=new HashSet<TreeMap<PriorityQueue<TreeSet>,Integer>>();
              TreeMap<PriorityQueue<TreeSet>,Integer> x1=new TreeMap<PriorityQueue<TreeSet>,Integer>();  
             
                   a.add(x1);
        HashSet<TreeMap<PriorityQueue<TreeSet>,Integer>> b=new HashSet<TreeMap<PriorityQueue<TreeSet>,Integer>>();
        TreeMap<PriorityQueue<TreeSet>,Integer> x2=new TreeMap<PriorityQueue<TreeSet>,Integer>();  
              
                   b.add(x2);
        HashSet<TreeMap<PriorityQueue<TreeSet>,Integer>> c=new HashSet<TreeMap<PriorityQueue<TreeSet>,Integer>>();
         TreeMap<PriorityQueue<TreeSet>,Integer> x3=new TreeMap<PriorityQueue<TreeSet>,Integer>();  
               
                   c.add(x3);
                   x.add(a);
          x.add(b);
          x.add(c);
    System.out.println(x);
        }
}
//[[{}], [{}], [{}]]