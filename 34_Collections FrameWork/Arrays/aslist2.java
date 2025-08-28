import java.util.Arrays;
import java.util.List;
class aslist2{
    public static void main(String[]args){
      int arr[]={12,45,67,89};
      List <int []>list=Arrays.asList(arr);
      for(int[] next: list){
System.out.println(next);
      }
    }
}
// [I@2f92e0f4