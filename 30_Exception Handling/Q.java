public class Q {
    
    public static void main(String[] args) {
       System.out.println("A");
       
           int i=Integer.parseInt(args[0]);
          int y[]={2,0,4};
          
          System.out.println(y[i]);
          System.out.println("C");
          int z=12/y[i];
          try{
          System.out.println("D");
       }
  catch (ArrayIndexOutOfBoundsException e) {    
    System.out.println(e);

       }
       catch (NumberFormatException e) {    
    System.out.println(e);

       }
       catch (ArithmeticException e) {    
    System.out.println(e);
   
       }
       finally{
        System.out.println("essential code");
       }
       
       System.out.println("F");
    }}
    
//at Q.main(Q.java:6)
// PS C:\Users\sahuj\java coaching code\30_Exception Handling> java Q 0
// A
// 2
// C
// D
// essential code
// F
// PS C:\Users\sahuj\java coaching code\30_Exception Handling> java Q 1
// A
// 0
// C
// Exception in thread "main" java.lang.ArithmeticException: / by zero
//         at Q.main(Q.java:11)