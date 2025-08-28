//unchecked Exception 
class M{
    public static void main(String[]args){
     System.out.println("A");
        int i=Integer.parseInt(args[0]);
        System.out.println("B");

// PS C:\Users\sahuj\java coaching code\31_Exception Handling> javac M.java
// PS C:\Users\sahuj\java coaching code\31_Exception Handling> java M   
// A
// Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
//         at M.main(M.java:4)

     }
}