//DeadLock
class GThread extends Thread {
 public void run() {
        H.i.pro();
    }
}
class GThread2 extends Thread  {
public void run() {
        H.i.info();
    }
}
public class H {
static  H i= new H();
    public static void main(String[] args) {
        Thread a = new GThread();
        Thread b = new GThread2() ;
        a.setName("A"); 
        b.setName("B");
       a.start();
       b.start();
    }
void pro(){ Thread t=Thread.currentThread();
     synchronized (H1.class){
        try {  t.sleep(200);} catch (InterruptedException e) { e.printStackTrace();}
        synchronized (H2.class){
            System.out.println("I am also fine "); } }}
void info(){ Thread t=Thread.currentThread();
     synchronized (H2.class){
        try {  t.sleep(200);} catch (InterruptedException e) { e.printStackTrace();}
        synchronized (H1.class){
            System.out.println("I am also fine "); }}
        }}
    class H1{}
    class H2{}