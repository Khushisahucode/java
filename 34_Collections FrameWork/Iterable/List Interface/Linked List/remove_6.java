import java.util.*;
class remove_6 {
    public static void main(String[] args) {
        LinkedList<Integer> x= new LinkedList<>();
        x.add(7);
        x.add(2);
        x.add(1);
        x.add(5);
        x.add(8);
         System.out.println("LinkedList   is : "+x);
             //i=2----> Wrapper class (class TYpe)  so Collection.remove()
            Integer i=2;
             x.remove(i); 
          System.out.println("LinkedList  After removing is : "+x);}
}
// LinkedList   is : [7, 2, 1, 5, 8]
// LinkedList  After removing is : [7, 1, 5, 8]

