public class A3 {
    

   
    public static void main(String[]args){
        int x=Integer.parseInt(args[0]);
        System.out.println(x);
    }
}
// Exception in thread "main" java.lang.NumberFormatException: For input string: "4m6"
//         at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
//         at java.base/java.lang.Integer.parseInt(Integer.java:588)
//         at java.base/java.lang.Integer.parseInt(Integer.java:685)
//         at A3.main(A3.java:6)