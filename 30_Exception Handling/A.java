class A{
    public static void main(String[]args){
        int x=12/0;
       System.out.println("start ");
        System.out.println(x);
         System.out.println("end ");
    }
}
// Exception in thread "main" java.lang.ArithmeticException: / by zero
//         at A.main(A.java:3)