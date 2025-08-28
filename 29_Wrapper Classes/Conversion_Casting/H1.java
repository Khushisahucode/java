public class H1 {
    public static void main(String[] args) {
        byte a=3;
        Integer x=  a;
        System.out.println("value of x : "+ x);
    }
}
//  ($?) { javac H1.java } ; if ($?) { java H1 }
// H1.java:4: error: incompatible types: byte cannot be converted to Integer
//         Integer x=  a;
//                     ^
// 1 error
