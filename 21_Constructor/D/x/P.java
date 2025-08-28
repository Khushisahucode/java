package x;
import a.Q;

public class P {
   public static void main(String[] args) {
     Q x=new Q();

   } 
}
/*
 * 
C:\Users\sahuj\java coaching code\Constructor\C>javac x/P.java
x\P.java:2: error: Q is not public in a; cannot be accessed from outside package
import a.Q;
        ^
x\P.java:6: error: Q is not public in a; cannot be accessed from outside package
     Q x=new Q();
     ^
x\P.java:6: error: Q is not public in a; cannot be accessed from outside package
     Q x=new Q();
             ^
3 errors
 */
