public class C {
    
    
//Constant ------>no
    public static void main(String[]args){
        int m=20;
        byte x=m;
        short y=m;
        char z=m;
         System.out.println("value of x : "+ x);
        System.out.println("value of y : "+ y);
    System.out.println("value of z : "+ z);
   
    }
}  
//  byte x=m;
//                ^
// C.java:8: error: incompatible types: possible lossy conversion from int to short
//         short y=m;
//                 ^
// C.java:9: error: incompatible types: possible lossy conversion from int to char
//         char z=m;
//                ^
// 3 errors