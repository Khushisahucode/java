import java.util.ArrayList;
import java.util.Collections;
public class ArrayList_2 {
    public static void main(String[] args) {
        ArrayList<Integer>arr=new ArrayList<>();
        arr.add(-4);
        arr.add(6);
        arr.add(0);
        arr.add(-7);
        arr.add(3);
        arr.add(4);
        arr.add(-8);
   Collections.sort(arr);
   System.out.println(arr);
   int maxsum=0; int sum=0;
   for (int i = 0; i < arr.size(); i++) {
    for(int j=0;j<arr.size();j++){
       sum=sum+arr.get(j);
       maxsum= Math.max(sum,maxsum);
   System.out.println("max value is : "+ maxsum);
    }   
    }

}
}