public class C {
    public static void main(String[] args) {
        short a=21;
        Short x=new Short(a);
        System.out.println(x);
    }
}
// C.java:4: warning: [removal] Short(short) in Short has been deprecated and marked for removal
//         Short x=new Short(a);
//                 ^
// 1 warning
// 21