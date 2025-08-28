public class K {
    
    public static void main(String[] args) {
        System.out.println("A "+ Thread.currentThread().getName());
       Thread x= new Thread(){
        public void run(){
    System.out.println("X"+ Thread.currentThread().getName() );
    int y=12/0;
    System.out.println("Y"+ Thread.currentThread().getName());
}};

x.setName(" yam");
x.start();
  System.out.println("B "+ Thread.currentThread().getName());
    
}
}
// PS C:\Users\sahuj\java coaching code\32_Stack Trace> cd "c:\Users\sahuj\java coaching code\32_Stack Trace\" ; if ($?) { javac K.java } ; if ($?) { java K }
// A main
// B main
// X yam
// Exception in thread " yam" java.lang.ArithmeticException: / by zero