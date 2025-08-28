import java.util.LinkedHashSet;
class add{
    public static void main(String[]args){
        LinkedHashSet<Integer>x=new LinkedHashSet<Integer>();
         x.add(56);
         x.add(15);
          x.add(-34);
         x.add(17);
          x.add(-21);
         x.add(19);
         System.out.println("Linked HashSEt is : "+ x); //Ordering But Not Sorted

    }
}
// Linked HashSEt is : [56, 15, -34, 17, -21, 19]