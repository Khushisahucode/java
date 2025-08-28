import java.util.TreeMap;
class put1{
    public static void main(String[]args){
   TreeMap<student,Double>x=new TreeMap< student,Double>();
    x.put(new student("khushi",12),12.56);
    x.put(new student("om",10),112.56);
   x.put(new student("riya",18),186.56);
   x.put(new student("madhu",23),136.6);
   x.put(new student("bhoomi",45),120.56);
   x.put(new student("ashvi",62),132.56);
    Double d=12.56;
    System.out.println( x); 
     System.out.println( x.put(new student("khushi",12),d));
     System.out.println( x); 
       Double d2=92.56;
     System.out.println( x.put(new student("khushi",12),d2));
     System.out.println( x); 
     System.out.println( x.put(new student("asika",34),d2));
     System.out.println( x); 
 }
}
// Exception in thread "main" java.lang.ClassCastException: class student cannot be cast to class java.lang.Comparable (student is in unnamed module of loader 'app'; java.lang.Comparable is in module java.base of loader 'bootstrap')
//         at java.base/java.util.TreeMap.compare(TreeMap.java:1607)
//         at java.base/java.util.TreeMap.addEntryToEmptyMap(TreeMap.java:812)
//         at java.base/java.util.TreeMap.put(TreeMap.java:821)
//         at java.base/java.util.TreeMap.put(TreeMap.java:570)
//         at put1.main(put1.java:5)