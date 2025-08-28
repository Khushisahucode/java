import java.util.TreeSet;
class C{
    public static void main(String[]args){
   TreeSet<String>x=new TreeSet<String>();
   x.add("khushi");
   x.add("mahi");
   x.add("ashvi");
   x.add("madhu");

     // String[ ] arr=new String[ x.size()];
      Object []arr2=x.toArray();
       for(Object next:arr2){
System.out.println(next.length()+ " ");
       }
 }
    }

// Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
//         The method length() is undefined for the type Object

//         at C.main(C.java:13)
