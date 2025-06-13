
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
public class B {
    public static void main(String[] args) {
        ArrayList<String>list=new ArrayList<>();
      list.add("khushi");
         list.add("madhu"); 
         list.add("tom"); 
         list.add("cat"); 
         list.add("jiya");  

        // Collections.sort(list,new Comparator<String>(){
        //     public int compare(String a,String b){
        //         return a.compareTo(b);
        //     }
        //  });
Collections.sort(list,(a,b)->a.compareTo(b));
         System.out.println("list is : "+ list);

}
}
