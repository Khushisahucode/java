import java.util.HashSet;
import java.util.Iterator;
class iterator{
    public static void main(String[]args){
     HashSet<Integer>x=new HashSet<Integer>();
        x.add(34);
        x.add(6);
        x.add(32);
        x.add(0);
        x.add(10);
         System.out.println("Hashset is : "+ x);
            Iterator itr=x.iterator();
            while(itr.hasNext()) {
                System.out.println(itr.next());
            }
    }}
// Hashset is : [32, 0, 34, 6, 10]
// 32
// 0
// 34
// 6
// 10