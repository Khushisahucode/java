class B{
    public static void main(String[]args){
        Integer x=Integer.valueOf("mohan");
        System.out.println("value of x :"+ x);
    }
}
// Exception in thread "main" java.lang.NumberFormatException: For input string: "mohan"
//         at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
//         at java.base/java.lang.Integer.parseInt(Integer.java:588)
//         at java.base/java.lang.Integer.valueOf(Integer.java:935)
//         at A.main(A.java:3)