import java.util.ArrayList;
import java.util.Collections;
class binarysearch{
    public static void main(String[]args){
        ArrayList<Integer>x=new ArrayList<>();
        x.add(45);
        x.add(443);
        x.add(34);
        x.add(40);
        x.add(15);
        x.add(46);
        System.err.println("list is : "+ x );

     int index=   Collections.binarySearch(x,34);
        System.out.println("key found in index : "+ index);

        
    }
}
// list is : [45, 443, 34, 40, 15, 46]
// key found in index : 2