import java.util.LinkedHashSet;
class add2{
    public static void main(String[]args){
        LinkedHashSet<String>x=new LinkedHashSet<String>();
         x.add("Khushi");
         x.add("mukul");
          x.add("uday");
         x.add("roopesh");
          x.add("ajay");
         x.add("ajay");
         System.out.println("Linked HashSEt is : "+ x); //Ordering But Not Sorted

    }
}
// Linked HashSEt is : [Khushi, mukul, uday, roopesh, ajay]