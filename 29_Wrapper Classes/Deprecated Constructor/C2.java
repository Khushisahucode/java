public class C2 {
    

    
    public static void main(String[] args) {
    
        Short x=new Short("mohan");
        System.out.println(x);
    }
}
//    Short x=new Short("mohan");
//                 ^
// 1 warning
// Exception in thread "main" java.lang.NumberFormatException: For input string: "mohan"
//         at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
//         at java.base/java.lang.Integer.parseInt(Integer.java:588)
//         at java.base/java.lang.Short.parseShort(Short.java:138)
//         at java.base/java.lang.Short.<init>(Short.java:379)
//         at C2.main(C2.java:7)