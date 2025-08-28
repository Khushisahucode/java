
//Assignment operator ---------->no
class D{
    public static void main(String[]args){
       D a=new D();
         System.out.println("value of x : "+a.pro(20) );
        System.out.println("value of y : "+ a.show(20));
    System.out.println("value of z : "+ a.process(20));
   }
int pro(byte x){
return x;
}
int show(short y){
  return y;
}
int process(char z){
  return z;
}
} 
// A.java:4: error: incompatible types: possible lossy conversion from int to byte
//          System.out.println("value of x : "+a.pro(20) );
//                                                   ^
// A.java:5: error: incompatible types: possible lossy conversion from int to short
//         System.out.println("value of y : "+ a.show(20));
//                                                    ^
// A.java:6: error: incompatible types: possible lossy conversion from int to char
//     System.out.println("value of z : "+ a.process(20));
//                                                   ^
// Note: Some messages have been simplified; recompile with -Xdiags:verbose to get full output
// 3 errors