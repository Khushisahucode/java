public class C {
    public static void main(String[] args) {
        String s=null;
        System.out.println(s.length());
    }
}
//Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.length()" because "<local1>" is null
       // at C.main(C.java:4)