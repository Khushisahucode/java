public class A1 {
    

    public static void main(String[]args){
        int x=Integer.parseInt("om");
        System.out.println(x);
    }
}
// Exception in thread "main" java.lang.NumberFormatException: For input string: "om"
//         at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
//         at java.base/java.lang.Integer.parseInt(Integer.java:588)
//         at java.base/java.lang.Integer.parseInt(Integer.java:685)
//         at A1.main(A1.java:5)