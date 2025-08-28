import java.util.TreeSet;

class add3 {
    public static void main(String[] args) {
        TreeSet<User> x = new TreeSet<User>();
        x.add(new User("khushi",15));
        x.add(new User("madhu",78));
         x.add(new User("om",24));
         x.add(new User("riya",50));
          x.add(new User("ayush",10));
         x.add(new User("rubi",13));
          System.out.println("TreeSet is : " + x);
        }
}
// Exception in thread "main" java.lang.ClassCastException: class User cannot be cast to class java.lang.Comparable (User is in unnamed module of loader 'app'; java.lang.Comparable is in module java.base of loader 'bootstrap')
//         at java.base/java.util.TreeMap.compare(TreeMap.java:1607)
//         at java.base/java.util.TreeMap.addEntryToEmptyMap(TreeMap.java:812)
//         at java.base/java.util.TreeMap.put(TreeMap.java:821)
//         at java.base/java.util.TreeMap.put(TreeMap.java:570)
//         at java.base/java.util.TreeSet.add(TreeSet.java:261)
//         at add3.main(add3.java:6)