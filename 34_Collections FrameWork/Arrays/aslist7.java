import java.util.Arrays;
import java.util.List;
class aslist7{
    public static void main(String[]args){
      int arr[]={12,45,67,89};
      List <int []>list=Arrays.asList(arr);
      //arr[0]=23;
   list.remove(0);
      System.out.print("array  is : ");
      for(int nx: arr){
        System.out.print(nx + " " ); }
      System.out.println("");
     System.out.print("list is : ");
      for(int[] nx: list){
        for(int next:nx)
System.out.print(next+ " ");
  }
    }
}
// Exception in thread "main" java.lang.UnsupportedOperationException
//         at java.base/java.util.AbstractList.remove(AbstractList.java:169)
//         at aslist7.main(aslist7.java:8)