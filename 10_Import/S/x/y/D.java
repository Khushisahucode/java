package x.y;
import a.b.C;

import a.b.c.C;


public class D {
    public static void main(String[]args ){
     
      
      C c1 =new C();
      
  /*
   * x\y\D.java:4: error: a type with the same simple name is already defined by the single-type-import of C
import a.b.c.C;
^
x\y\D.java:11: error: reference to C is ambiguous
      C c1 =new C();
      ^
  both class a.b.C in a.b and class a.b.c.C in a.b.c match
x\y\D.java:11: error: reference to C is ambiguous
      C c1 =new C();
                ^
  both class a.b.C in a.b and class a.b.c.C in a.b.c match
3 errors
   */



    }
  
}
