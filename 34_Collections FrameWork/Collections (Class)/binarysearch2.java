import java.util.ArrayList;
import java.util.Collections;
class binarysearch2{
    public static void main(String[]args){
        ArrayList<Integer>x=new ArrayList<>();
        x.add(45);
        x.add(443);
        x.add(34);
        x.add(40);
        x.add(15);
        x.add(46);
        System.err.println("list is : "+ x );
     Collections.sort(x);
     int index=   Collections.binarySearch(x,34);
        System.out.println(x+ "\n"+"key found in index : "+ index);
int index2=   Collections.binarySearch(x,40);
        System.out.println("key found in index : "+ index2);
        int index3=   Collections.binarySearch(x,443);
        System.out.println("key found in index : "+ index3);
        
    }}
// list is : [45, 443, 34, 40, 15, 46]
// [15, 34, 40, 45, 46, 443]
// key found in index : 1
// key found in index : 2
// key found in index : 5
