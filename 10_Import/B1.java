 import java.io.File;
 class B1 {
    public static void main(String[]args){
        File a;
        Date d;
        ArrayList  a3;
        Format f1;
    }  
    
}
/*
 * B1.java:5: error: cannot find symbol
        Date d;
        ^
  symbol:   class Date
  location: class C
B1.java:6: error: cannot find symbol
        ArrayList  a;
        ^
  symbol:   class ArrayList
  location: class C
B1.java:6: error: variable a is already defined in method main(String[])
        ArrayList  a;
                   ^
B1.java:7: error: cannot find symbol
        Format f1;
        ^
  symbol:   class Format
  location: class C
4 errors
 */