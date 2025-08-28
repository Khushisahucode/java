import java.util.TreeMap;
public class headmap2 {
     public static void main(String[] args) {
        TreeMap<String,Integer>x=new TreeMap<String,Integer>(); 
        x.put ("om",12);
      x.put ("ashvi",34);
      x.put ("vivek",10);
      x.put ("uday",192);
      x.put ("mohan",32);
       System.out.println(x);
      System.out.println(x.headMap("nitin"));
      System.out.println(x.headMap("khushi"));
       System.out.println(x.headMap("rishabh"));
        System.out.println(x.headMap("vivek"));
    }
}
// {ashvi=34, mohan=32, om=12, uday=192, vivek=10}
// {ashvi=34, mohan=32}
// {ashvi=34}
// {ashvi=34, mohan=32, om=12}
// {ashvi=34, mohan=32, om=12, uday=192}