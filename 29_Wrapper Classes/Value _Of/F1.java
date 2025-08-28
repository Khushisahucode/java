public class F1 {
    
    public static void main(String[] args) {
       short a=50000;
        Short x=Short.valueOf(a);
        System.out.println(x);
    }
}

// F1.java:4: error: incompatible types: possible lossy conversion from int to short
//        short a=50000;
//                ^
// 1 error