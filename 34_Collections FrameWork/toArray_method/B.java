import java.util.TreeSet;
class B{
    public static void main(String[]args){
   TreeSet<String>x=new TreeSet<String>();
   x.add("khushi");
   x.add("mahi");
   x.add("ashvi");
   x.add("madhu");

      String[ ] arr=new String[ x.size()];
      String []arr2=x.toArray(arr);
       for(String next:arr2){
System.out.println(next+ " ");
       }
 }
    }

