class O1{
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
        HashSet<TreeMap<Float,Integer>> c=new HashSet<TreeMap<Float,Integer>>();
         TreeMap<Float,Integer> x3=new TreeMap<Float,Integer>();  
                x3.put(34.56f,78);
                 x3.put(34.67f,45);
                  x3.put(34.78f,38);
                  // x3.put("hariom",101);
                   c.add(x3);
                   x.add(a);
          x.add(b);
          x.add(c);
    System.out.println(x);
        }
}
// /PS D:\Java Coaching Code\35_Generics> cd "d:\Java Coaching Code\35_Generics\" ; if ($?) { javac O1.java } ; if ($?) { java O1 }
// O1.java:3: error: cannot find symbol
//         ArrayList<HashSet <TreeMap<String,Integer> >> x= new ArrayList<HashSet <TreeMap<String,Integer> >>();
//         ^
//   symbol:   class ArrayList
//   location: class O1
// O1.java:3: error: cannot find symbol
//         ArrayList<HashSet <TreeMap<String,Integer> >> x= new ArrayList<HashSet <TreeMap<String,Integer> >>();
//                   ^
//   symbol:   class HashSet
//   location: class O1
// O1.java:3: error: cannot find symbol
//         ArrayList<HashSet <TreeMap<String,Integer> >> x= new ArrayList<HashSet <TreeMap<String,Integer> >>();
//                            ^
//   symbol:   class TreeMap
//   location: class O1
// O1.java:3: error: cannot find symbol
//         ArrayList<HashSet <TreeMap<String,Integer> >> x= new ArrayList<HashSet <TreeMap<String,Integer> >>();
//                                                              ^
//   symbol:   class ArrayList
//   location: class O1
// O1.java:3: error: cannot find symbol
//         ArrayList<HashSet <TreeMap<String,Integer> >> x= new ArrayList<HashSet <TreeMap<String,Integer> >>();
//                                                                        ^
//   symbol:   class HashSet
//   location: class O1
// O1.java:3: error: cannot find symbol
//         ArrayList<HashSet <TreeMap<String,Integer> >> x= new ArrayList<HashSet <TreeMap<String,Integer> >>();
//                                                                                 ^
//   symbol:   class TreeMap
//   location: class O1
// O1.java:4: error: cannot find symbol
//          HashSet<TreeMap<String,Integer>> a=new HashSet<TreeMap<String,Integer>>();
//          ^
//   symbol:   class HashSet
//   location: class O1
// O1.java:4: error: cannot find symbol
//          HashSet<TreeMap<String,Integer>> a=new HashSet<TreeMap<String,Integer>>();
//                  ^
//   symbol:   class TreeMap
//   location: class O1
// O1.java:4: error: cannot find symbol
//          HashSet<TreeMap<String,Integer>> a=new HashSet<TreeMap<String,Integer>>();
//                                                 ^
//   symbol:   class HashSet
//   location: class O1
// O1.java:4: error: cannot find symbol
//          HashSet<TreeMap<String,Integer>> a=new HashSet<TreeMap<String,Integer>>();
//                                                         ^
//   symbol:   class TreeMap
//   location: class O1
// O1.java:5: error: cannot find symbol
//               TreeMap<String,Integer> x1=new TreeMap<String,Integer>();
//               ^
//   symbol:   class TreeMap
//   location: class O1
// O1.java:5: error: cannot find symbol
//               TreeMap<String,Integer> x1=new TreeMap<String,Integer>();
//                                              ^
//   symbol:   class TreeMap
//   location: class O1
// O1.java:11: error: cannot find symbol
//         HashSet<TreeMap<String,Integer>> b=new HashSet<TreeMap<String,Integer>>();
//         ^
//   symbol:   class HashSet
//   location: class O1
// O1.java:11: error: cannot find symbol
//         HashSet<TreeMap<String,Integer>> b=new HashSet<TreeMap<String,Integer>>();
//                 ^
//   symbol:   class TreeMap
//   location: class O1
// O1.java:11: error: cannot find symbol
//         HashSet<TreeMap<String,Integer>> b=new HashSet<TreeMap<String,Integer>>();
//                                                ^
//   symbol:   class HashSet
//   location: class O1
// O1.java:11: error: cannot find symbol
//         HashSet<TreeMap<String,Integer>> b=new HashSet<TreeMap<String,Integer>>();
//                                                        ^
//   symbol:   class TreeMap
//   location: class O1
// O1.java:12: error: cannot find symbol
//         TreeMap<String,Integer> x2=new TreeMap<String,Integer>();
//         ^
//   symbol:   class TreeMap
//   location: class O1
// O1.java:12: error: cannot find symbol
//         TreeMap<String,Integer> x2=new TreeMap<String,Integer>();
//                                        ^
//   symbol:   class TreeMap
//   location: class O1
// O1.java:18: error: cannot find symbol
//         HashSet<TreeMap<Float,Integer>> c=new HashSet<TreeMap<Float,Integer>>();
//         ^
//   symbol:   class HashSet
//   location: class O1
// O1.java:18: error: cannot find symbol
//         HashSet<TreeMap<Float,Integer>> c=new HashSet<TreeMap<Float,Integer>>();
//                 ^
//   symbol:   class TreeMap
//   location: class O1
// O1.java:18: error: cannot find symbol
//         HashSet<TreeMap<Float,Integer>> c=new HashSet<TreeMap<Float,Integer>>();
//                                               ^
//   symbol:   class HashSet
//   location: class O1
// O1.java:18: error: cannot find symbol
//         HashSet<TreeMap<Float,Integer>> c=new HashSet<TreeMap<Float,Integer>>();
//                                                       ^
//   symbol:   class TreeMap
//   location: class O1
// O1.java:19: error: cannot find symbol
//          TreeMap<Float,Integer> x3=new TreeMap<Float,Integer>();
//          ^
//   symbol:   class TreeMap
//   location: class O1
// O1.java:19: error: cannot find symbol
//          TreeMap<Float,Integer> x3=new TreeMap<Float,Integer>();
//                                        ^
//   symbol:   class TreeMap
//   location: class O1
// 24 errors