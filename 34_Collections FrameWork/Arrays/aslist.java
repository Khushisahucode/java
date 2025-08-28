import java.util.Arrays;
import java.util.List;
class aslist{
    public static void main(String[]args){
      int arr[]={12,45,67,89};
      List <Integer>list=Arrays.asList(arr);
      for(int next: list){
System.out.println(next);
      }
    }
}
// aslist.java:6: error: incompatible types: inference variable T has incompatible bounds
//       List <Integer>list=Arrays.asList(arr);
//                                       ^
//     equality constraints: Integer
//     lower bounds: int[]
//   where T is a type-variable:
//     T extends Object declared in method <T>asList(T...)
// 1 error