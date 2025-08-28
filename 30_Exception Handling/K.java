public class K {
     public static void main(String[] args) {
   System.out.println("start");
   try{
   int val= Integer.parseInt(args[0]);
    }catch(ArrayIndexOutOfBoundsException e){
        System.out.println("some problm ");
    }
   System.out.println("end");
    }
}
// start
// some problm 
// end            
// PS C:\Users\sahuj\java coaching code\Exception Handling> java K om
// start
// Exception in thread "main" java.lang.NumberFormatException: For input string: "om"
//         at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
//         at java.base/java.lang.Integer.parseInt(Integer.java:588)
//         at java.base/java.lang.Integer.parseInt(Integer.java:685)
//         at K.main(K.java:6)
// PS C:\Users\sahuj\java coaching code\Exception Handling> java K 45
// start
// end
// PS C:\Users\sahuj\java coaching code\Exception Handling> java k
// Error: Could not find or load main class k
// Caused by: java.lang.NoClassDefFoundError: k (wrong name: K)
