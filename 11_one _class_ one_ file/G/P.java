class P{
     public static void main(String[]args){

        B b1 =new B();
        b1.pro();
        System.out.print("value of y :");
        System.out.print(b1.y);
    }
}/*
P.java:4: error: cannot find symbol
        B b1 =new B();
        ^
  symbol:   class B
  location: class P
P.java:4: error: cannot find symbol
        B b1 =new B();
                  ^
  symbol:   class B
  location: class P
2 errors
 */