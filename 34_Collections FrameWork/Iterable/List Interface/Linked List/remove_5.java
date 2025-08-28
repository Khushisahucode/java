import java.util.*;
class remove_5 {
    public static void main(String[] args) {
        LinkedList<Integer> x= new LinkedList<>();
        x.add(7);
        x.add(2);
        x.add(1);
        x.add(5);
        x.add(8);
         System.out.println("LinkedList   is : "+x);
             //2----> primitive type so List.remove()
          x.remove(2); 
          System.out.println("LinkedList  After removing is : "+x);}
}
// LinkedList   is : [7, 2, 1, 5, 8]
// LinkedList  After removing is : [7, 2, 5, 8]
