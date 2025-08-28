import java.util.Arrays;
import java.util.List;
class aslist4{
    public static void main(String[]args){
      int arr[][][]={{{12,45}},{{67,89}}};
      List <int []>list=Arrays.asList(arr);
      for(int[] nx: list){
        for(int next:nx)
System.out.print(next+ " ");

      }
    }
} 
// aslist4.java:6: error: incompatible types: inference variable T has incompatible bounds
//       List <int []>list=Arrays.asList(arr);
//                                      ^
//     equality constraints: int[]
//     lower bounds: int[][]
//   where T is a type-variable:
//     T extends Object declared in method <T>asList(T...)
// 1 error