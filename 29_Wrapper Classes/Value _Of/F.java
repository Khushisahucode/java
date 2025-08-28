public class F {
    public static void main(String[] args) {
       // short a=5;
        Short x=Short.valueOf(4);
        System.out.println(x);
    }
}
// F.java:4: error: no suitable method found for valueOf(int)
//         Short x=Short.valueOf(4);
//                      ^
//     method Short.valueOf(String) is not applicable
//       (argument mismatch; int cannot be converted to String)
//     method Short.valueOf(short) is not applicable
//       (argument mismatch; possible lossy conversion from int to short)
// Note: Some messages have been simplified; recompile with -Xdiags:verbose to get full output
// 1 error