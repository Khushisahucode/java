public class B1 {
   
    
    public static void main(String[]args){
        Long x=Long.parseLong("4j5");
        System.out.println(x);
    }
}
//    Exception in thread "main" java.lang.NumberFormatException: For input string: "4j5"
//         at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
//         at java.base/java.lang.Long.parseLong(Long.java:618)
//         at java.base/java.lang.Long.parseLong(Long.java:722)
//         at B1.main(B1.java:5)  

