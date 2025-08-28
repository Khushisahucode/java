import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeMap;
class O{
    public static void main(String[] args) {
        ArrayList<HashSet <TreeMap<String,Integer> >> x= new ArrayList<HashSet <TreeMap<String,Integer> >>();
         HashSet<TreeMap<String,Integer>> a=new HashSet<TreeMap<String,Integer>>();
              TreeMap<String,Integer> x1=new TreeMap<String,Integer>();  
                x1.put("khushi",78);
                 x1.put("om",45);
                  x1.put("ashvi",38);
                   x1.put("madhu",101);
                   a.add(x1);
        HashSet<TreeMap<String,Integer>> b=new HashSet<TreeMap<String,Integer>>();
        TreeMap<String,Integer> x2=new TreeMap<String,Integer>();  
                x2.put("kavya",348);
                 x2.put("rishabh",35);
                  x2.put("ishu",30);
                   x2.put("mohan",11);
                   b.add(x2);
        HashSet<TreeMap<String,Integer>> c=new HashSet<TreeMap<String,Integer>>();
         TreeMap<String,Integer> x3=new TreeMap<String,Integer>();  
                x3.put("bhoomi",78);
                 x3.put("sakshi",45);
                  x3.put("uday",38);
                   x3.put("hariom",101);
                   c.add(x3);
                   x.add(a);
          x.add(b);
          x.add(c);
    System.out.println(x);
        }
}
//[[{ashvi=38, khushi=78, madhu=101, om=45}], [{ishu=30, kavya=348, mohan=11, rishabh=35}], [{bhoomi=78, hariom=101, sakshi=45, uday=38}]]