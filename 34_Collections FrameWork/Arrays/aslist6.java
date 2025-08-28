import java.util.Arrays;
import java.util.List;
class aslist6{
    public static void main(String[]args){
      int arr[]={12,45,67,89};
      List <int []>list=Arrays.asList(arr);
      //arr[0]=23;
   list.get(0)[1]=100;
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
//array  is : 12 100 67 89 
//list is : 12 100 67 89 