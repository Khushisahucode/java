public class M1 {
    
    //unchecked Exception 
 public static void main(String[]args){
     System.out.println("A");
       try{
     int i=Integer.parseInt(args[0]);}
     catch(ArrayIndexOutOfBoundsException e){
     System.out.println(e);
     }
        System.out.println("B");
     }
}
// PS C:\Users\sahuj\java coaching code\31_Exception Handling> javac M1.java
// PS C:\Users\sahuj\java coaching code\31_Exception Handling> java M1
// A
//  java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
// B
// PS C:\Users\sahuj\java coaching code\31_Exception Handling> java M1 8
// A
// B    