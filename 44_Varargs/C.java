class C{
   static String add(){
    return "hello";
    }
    public static void main(String[]args){
     add();
     add(23,445,67);
     add(34,12);
     int [] arr={12,3,768,6,76,9,8};
     add(arr);
    }
}
// C.java:7: error: method add in class C cannot be applied to given types;
//      add(23,445,67);
//      ^
//   required: no arguments
//   found:    int,int,int
//   reason: actual and formal argument lists differ in length
// C.java:8: error: method add in class C cannot be applied to given types;
//      add(34,12);
//      ^
//   required: no arguments
//   found:    int,int
//   reason: actual and formal argument lists differ in length
// C.java:10: error: method add in class C cannot be applied to given types;
//      add(arr);
//      ^
//   required: no arguments
//   found:    int[]
//   reason: actual and formal argument lists differ in length
// 3 errors