import java.util.TreeSet;
class E{
    public static void main(String[]args){
   TreeSet<String>x=new TreeSet<String>();
   x.add("khushi");
   x.add("mahi");
   x.add("ashvi");
   x.add("madhu");

      String[] arr=new String[ 0];
      String []arr2=x.toArray(arr);
      System.out.println(  arr==arr2);
       for(String next:arr2){
System.out.println(next.length()+ " "+ next);
       }
 }
    }
// false
// 5 ashvi
// 6 khushi
// 5 madhu
// 4 mahi