public class J {
    public static void main(String[] args) {
        System.out.println("A "+ Thread.currentThread().getName());
        new Thread(new A1(),"golu").start();
        System.out.println("B "+ Thread.currentThread().getName());
    }

}
 class A1 implements Runnable{
public void run(){
    System.out.println("X "+ Thread.currentThread().getName());
    int y=12/0;
    System.out.println("Y"+ Thread.currentThread().getName());
}
}
 //A main
// B main
// X golu
// Exception in thread "golu" java.lang.ArithmeticException: / by zero
//         at A1.run(J.java:12)