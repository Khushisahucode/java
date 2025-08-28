import java.util.ArrayList;
import java.util.Collections;
class binarysearch3{
    public static void main(String[]args){
        ArrayList<String>x=new ArrayList<String>();
         x.add("prithvi");
        x.add("agni");
        x.add("pinaka");
        x.add("aakash");
        x.add("naag");
        x.add("brahmos");
         x.add("kusha");
        x.add("k6");
        System.err.println("list is : "+ x );
     Collections.sort(x);
     int index=   Collections.binarySearch(x,"naag");
        System.out.println(x+ "\n"+"key found in index : "+ index);
int index2=   Collections.binarySearch(x,"khushi");
        System.out.println("key found in index : "+ index2);
        int index3=   Collections.binarySearch(x,"nobita");
        System.out.println("key found in index : "+ index3);
        
    }}
// list is : [prithvi, agni, pinaka, aakash, naag, brahmos, kusha, k6]
// [aakash, agni, brahmos, k6, kusha, naag, pinaka, prithvi]
// key found in index : 5
// key found in index : -5
// key found in index : -7