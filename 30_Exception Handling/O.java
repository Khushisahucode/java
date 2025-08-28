public class O {
    
    public static void main(String[] args) {
       System.out.println("A"); 
       System.out.println("essential code ............");
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
   System.out.println("essential code ............");
       }
       catch (NumberFormatException e) {    
    System.out.println(e);
   System.out.println("essential code ............");
       }
       catch (ArithmeticException e) {    
    System.out.println(e);
    System.out.println("essential code ............");
       }
       
       System.out.println("F");
    }
}
// PS C:\Users\sahuj\java coaching code\30_Exception Handling> java O 
// A
// essential code ............
// java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
// essential code ............
// F
// PS C:\Users\sahuj\java coaching code\30_Exception Handling> java O 0
// A
// essential code ............
// 2
// C
// D
// F
// PS C:\Users\sahuj\java coaching code\30_Exception Handling> java O 1
// A
// essential code ............
// 0
// C
// java.lang.ArithmeticException: / by zero
// essential code ............
// F
// PS C:\Users\sahuj\java coaching code\30_Exception Handling> java O 2
// A
// essential code ............
// 4
// C
// D
// F
// PS C:\Users\sahuj\java coaching code\30_Exception Handling> java O 3
// A
// essential code ............
// java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
// essential code ............
// F
