class A{
    public static void main(String[]args){
        B x=new B();
      System.out.print(  x.y);
    }
}
/*
 * C:\Users\sahuj\java coaching code\Class Resolve\F>javac A.java
A.java:3: error: cannot find symbol
        B x=new B();
        ^
  symbol:   class B
  location: class A
A.java:3: error: cannot find symbol
        B x=new B();
                ^
  symbol:   class B
  location: class A
2 errors
 */