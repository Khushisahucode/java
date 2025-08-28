import java.util.Arrays;
import java.util.List;
class aslist3{
    public static void main(String[]args){
      int arr[]={12,45,67,89};
      List <int []>list=Arrays.asList(arr);
      System.out.println(list);
      for(int[] nx: list){
        for(int next:nx)
System.out.print(next+ " ");

      }
    }
}
// [[I@2f92e0f4]
// 12 45 67 89 