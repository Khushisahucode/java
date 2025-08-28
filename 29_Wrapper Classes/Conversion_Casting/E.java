public class E {
    //Assignment operator ---------->no

    public static void main(String[]args){
       E a=new E();
        a.pro(20) ;
        a.show(20);
    a.process(20);
   }
void pro(byte x){
  System.out.println(x);
}
void show(short y){
  System.out.println(y);
}
void process(char z){
System.out.println(z);
}
} 
// F.java:6: error: incompatible types: possible lossy conversion from int to byte
//         a.pro(20) ;
//               ^
// F.java:7: error: incompatible types: possible lossy conversion from int to short
//         a.show(20);
//                ^
// F.java:8: error: incompatible types: possible lossy conversion from int to char
//     a.process(20);
//               ^
// Note: Some messages have been simplified; recompile with -Xdiags:verbose to get full output
// 3 errors