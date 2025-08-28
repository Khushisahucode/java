public class M {
    
 public static void main(String[] args) {
       System.out.println("A"); 
       try {
           int i=Integer.parseInt(args[0]);
          int y[]={2,0,4};
          System.out.println(y[i]);
          System.out.println("C");
          int z=12/y[i];
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
       
       System.out.println("F");
    }
}
// PS C:\Users\sahuj\java coaching code\30_Exception Handling> java M 
// A
// java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
// F
// PS C:\Users\sahuj\java coaching code\30_Exception Handling> java M 0
// A
// 2
// C
// D
// F
// PS C:\Users\sahuj\java coaching code\30_Exception Handling> java M 1
// A
// 0
// C
// java.lang.ArithmeticException: / by zero
// F
// PS C:\Users\sahuj\java coaching code\30_Exception Handling> java M 2
// A
// 4
// C
// D
// F
// PS C:\Users\sahuj\java coaching code\30_Exception Handling> java M 3
// A
// java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
// F