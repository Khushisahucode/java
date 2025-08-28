public class N {
    

   public static void main(String[]args){
       N a=new N();
       System.out.println(a.pro()); 
       System.out.println(a.show()); 
       System.out.println(a.process());
   }
Byte pro(){
  return 128;
}
Short show(){
 return 32768; 
}
Character process(){
    return 65536;
}

}
// N.java:11: error: incompatible types: int cannot be converted to Byte
//   return 128;
//          ^
// //  return 128;
// //          ^
// // N.java:14: error: incompatible types: int cannot be converted to Short
// //  return 32768;
//         ^
// N.java:17: error: incompatible types: int cannot be converted to Character
//     return 65536;
//            ^
// 3 errors