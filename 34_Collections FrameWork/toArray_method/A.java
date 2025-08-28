import java.util.TreeSet;
class A{
    public static void main(String[]args){
   TreeSet<Integer>x=new TreeSet<Integer>();
   x.add(34);
   x.add(90);
   x.add(21);
   x.add(111);
   Object []arr = x.toArray();
   for(Object next: arr){
    System.out.println(next);
   }
   

    }
}
