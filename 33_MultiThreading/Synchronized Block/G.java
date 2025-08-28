//DeadLock
class GThread extends Thread {
 public void run() {
        G.i.pro();
    }
}

class GThread2 extends Thread  {

    public void run() {
        G.j.info();
    }
}

public class G {
static  x1 i= new x1();
    static x2 j = new x2();
public static void main(String[] args) {
        Thread a = new GThread();
        Thread b = new GThread2
        () ;
        a.setName("A"); 
        b.setName("B");
       a.start();
       b.start();
    }}
   class x1{
     synchronized void pro() {
        String name = Thread.currentThread().getName();
        Thread t = Thread.currentThread();
        
            for (int i = 0; i < 40; i++) {
                try {
                    t.sleep(200); } catch (InterruptedException e ){}
                 if(i==10){G.j.info();}
                System.out.println(i + "___" + name);
                
            }
        }
    }
      class x2{
     synchronized void info() {
        String name = Thread.currentThread().getName();
        Thread t = Thread.currentThread();
        
            for (int i = 0; i < 40; i++) {
                try {t.sleep(200); } catch (InterruptedException e) {e.printStackTrace(); }
              if (i==10){
                G.i.pro();}
                System.out.println(i + "___" + name);
            
            }
        }
      }
// 0___A
// 1___A
// 0___B
// 2___A
// 1___B
// 3___A
// 2___B
// 4___A
// 3___B
// 5___A
// 4___B
// 6___A
// 5___B
// 7___A
// 6___B
// 8___A
// 7___B
// 9___A
// 8___B
// 9___B
//cursor blink