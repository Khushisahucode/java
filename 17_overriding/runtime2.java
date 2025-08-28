class z2{
    void pro(){
        System.out.println("hii");
    }
}

public class runtime2  extends z2{
   public static void main(String[] args) {
   z2 x=new runtime2();
   x.pro();
   x.info();
   } 
   void info(){
    System.out.println("hello");
   }
}/*
runtime2.java:11: error: cannot find symbol
   x.info();
    ^
  symbol:   method info()
  location: variable x of type z2
1 error */
