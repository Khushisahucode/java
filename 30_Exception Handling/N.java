public class N {
    
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
       catch (ArrayIndexOutOfBoundsException|NumberFormatException |ArithmeticException e) {    
    System.out.println(e);
   System.out.println("E");
       }
      System.out.println("F");
    }
}

// A
// java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
// E
// F
// PS C:\Users\sahuj\java coaching code\30_Exception Handling> java N                                                                                            
// A
// java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
// E
// F
// PS C:\Users\sahuj\java coaching code\30_Exception Handling> java N 0
// A
// 2
// C
// D
// F
// PS C:\Users\sahuj\java coaching code\30_Exception Handling> java N 1
// A
// 0
// C
// java.lang.ArithmeticException: / by zero
// E
// F
// PS C:\Users\sahuj\java coaching code\30_Exception Handling> java N 2
// A
// 4
// C
// D
// F
// PS C:\Users\sahuj\java coaching code\30_Exception Handling> java N 3
// A
// java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
// E
// F