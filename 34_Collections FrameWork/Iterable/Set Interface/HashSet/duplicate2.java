// Duplicate are not Allowed
import java.util.HashSet;
class duplicate2{
    public static void main(String[]args){
     HashSet<Integer>x=new HashSet<Integer>();
       x.add(67);
        x.add(765);
        x.add(67);
         x.add(10);
         x.add(55);
         System.out.println("Hashset is : "+ x);

    }}
// Hashset is : [67, 55, 10, 765]