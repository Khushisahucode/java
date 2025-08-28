import java.util.ArrayList;
import java.util.Collections;
class sort2{
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
        System.out.println("list is : "+ x);}
}
// list is : [prithvi, agni, pinaka, aakash, naag, brahmos, kusha, k6]
// list is : [aakash, agni, brahmos, k6, kusha, naag, pinaka, prithvi]
