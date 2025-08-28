import java.util.*;
class remove_5 {
    public static void main(String[] args) {
        Vector<Integer> x= new Vector<>();
        x.add(7);
        x.add(2);
        x.add(1);
        x.add(5);
        x.add(8);
         System.out.println("Vector   is : "+x);
             //2----> primitive type so List.remove()
          x.remove(2); 
          System.out.println("Vector  After removing is : "+x);}
}
// Vector   is : [7, 2, 1, 5, 8]
// Vector  After removing is : [7, 2, 5, 8]
