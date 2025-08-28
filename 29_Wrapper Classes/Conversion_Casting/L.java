
class L{
   public static void main(String[]args){
       E a=new E();
        a.pro(20) ;
        a.show(20);
        a.process(20);
   }
void pro(Byte x){
  System.out.println(x);
}
void show(Short y){
  System.out.println(y);
}
void process(Character z){
System.out.println(z);
}
}
// .\E.java:6: error: incompatible types: possible lossy conversion from int to byte
//         a.pro(20) ;
//               ^
// .\E.java:7: error: incompatible types: possible lossy conversion from int to short
//         a.show(20);
//                ^
// .\E.java:8: error: incompatible types: possible lossy conversion from int to char
//     a.process(20);
//               ^