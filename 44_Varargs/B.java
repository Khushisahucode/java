class B{
   static int add(int x){
    return x+y;
    }
    public static void main(String[]args){
     add();
     add(23,445,67);
     add(34,12);
     int [] arr={12,3,768,6,76,9,8};
     add(arr);
    }
}
// B.java:3: error: cannot find symbol
//     return x+y;
//              ^
//   symbol:   variable y
//   location: class B
// B.java:6: error: method add in class B cannot be applied to given types;
//      add();
//      ^
//   required: int
//   found:    no arguments
//   reason: actual and formal argument lists differ in length
// B.java:7: error: method add in class B cannot be applied to given types;
//      add(23,445,67);
//      ^
//   required: int
//   found:    int,int,int
//   reason: actual and formal argument lists differ in length
// B.java:8: error: method add in class B cannot be applied to given types;
//      add(34,12);
//      ^
//   required: int
//   found:    int,int
//   reason: actual and formal argument lists differ in length
// B.java:10: error: incompatible types: int[] cannot be converted to int
//      add(arr);
//          ^
// Note: Some messages have been simplified; recompile with -Xdiags:verbose to get full output
// 5 errors