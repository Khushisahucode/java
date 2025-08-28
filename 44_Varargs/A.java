class A{
   static int add(int x,int y){
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
// A.java:6: error: method add in class A cannot be applied to given types;
//      add();
//      ^
//   required: int,int
//   found:    no arguments
//   reason: actual and formal argument lists differ in length
// A.java:7: error: method add in class A cannot be applied to given types;
//      add(23,445,67);
//      ^
//   required: int,int
//   found:    int,int,int
//   reason: actual and formal argument lists differ in length
// A.java:10: error: method add in class A cannot be applied to given types;
//      add(arr);
//      ^
//   required: int,int
//   found:    int[]
//   reason: actual and formal argument lists differ in length
// 3 errors