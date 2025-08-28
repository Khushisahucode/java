public class B {
    
//Range ------>no
    public static void main(String[]args){
        byte x=233;
        short y=230000;
        char z=230000000;
         System.out.println("value of x : "+ x);
        System.out.println("value of y : "+ y);
    System.out.println("value of z : "+ z);
    }
}  
//  ($?) { javac B.java } ; if ($?) { java B }
// B.java:5: error: incompatible types: possible lossy conversion from int to byte
//         byte x=233;
//                ^
// B.java:6: error: incompatible types: possible lossy conversion from int to short
//         short y=230000;
//                 ^
// B.java:7: error: incompatible types: possible lossy conversion from int to char
//         char z=230000000;