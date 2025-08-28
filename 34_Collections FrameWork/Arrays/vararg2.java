public class vararg2 {
    public static void main(String[] args) {
       int [][]arr=new int [2][4];
        pro(arr);
    }
    void pro(int ...arr){

    }
}
// vararg2.java:4: error: method pro in class vararg2 cannot be applied to given types;
//         pro(arr);
//         ^
//   required: int[]
//   found:    int[][]
//   reason: varargs mismatch; int[][] cannot be converted to int
// 1 error