public class D {
     @SuppressWarnings("deprecation")
    public static void main(String[]args){
        Integer x=new Integer("89");
        System.out.println(x);
    }
}
// D.java:4: warning: [removal] Integer(String) in Integer has been deprecated and marked for removal
//         Integer x=new Integer("89");
//                   ^
// 1 warning
// 89