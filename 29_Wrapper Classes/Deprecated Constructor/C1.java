public class C1 {
    
    public static void main(String[] args) {
        short a= (short)327678;
        Short x=new Short(a);
        System.out.println(x);
    }
}
// C1.java:5: warning: [removal] Short(short) in Short has been deprecated and marked for removal
//         Short x=new Short(a);
//                 ^
// 1 warning
// -2
