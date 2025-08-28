
class FRunnable implements Runnable {
 public void run() {
        F.x1.pro();
    }
}

class FRunnable2 implements Runnable {

    public void run() {
        F.x2.info();
    }
}

public class F {
static F x1 = new F();
    static F x2 = new F();
public static void main(String[] args) {
        Thread t1 = new Thread(new FRunnable(), "A");
        Thread t2 = new Thread(new FRunnable2(), "B");
        t1.start();
        t2.start();
    }
    void pro() {
        String name = Thread.currentThread().getName();
        Thread t = Thread.currentThread();
        synchronized (F.class) {
            for (int i = 0; i < 30; i++) {
                try {
                    t.sleep(100);
                } catch (InterruptedException e) {e.printStackTrace();
                }
                System.out.println(i + "~~~" + name);
            }
        }
    }
     synchronized   void info() {
        String name = Thread.currentThread().getName();
        Thread t = Thread.currentThread();
        
            for (int i = 0; i < 30; i++) {
                try {
                    t.sleep(100);
                } catch (InterruptedException e) {e.printStackTrace();
                }
                System.out.println(i + "~~~" + name);
            }
        }
    }
//f ($?) { java F }
// 0~~~B
// 0~~~A
// 1~~~A
// 1~~~B
// 2~~~B
// 2~~~A
// 3~~~A
// 3~~~B
// 4~~~A
// 4~~~B
// 5~~~B
// 5~~~A
// 6~~~A
// 6~~~B
// 7~~~B
// 7~~~A
// 8~~~A
// 8~~~B
// 9~~~A
// 9~~~B
// 10~~~A
// 10~~~B
// 11~~~B
// 11~~~A
// 12~~~A
// 12~~~B
// 13~~~B
// 13~~~A
// 14~~~A
// 14~~~B
// 15~~~A
// 15~~~B
// 16~~~A
// 16~~~B
// 17~~~B
// 17~~~A
// 18~~~B
// 18~~~A
// 19~~~B
// 19~~~A
// 20~~~A
// 20~~~B
// 21~~~B
// 21~~~A
// 22~~~B
// 22~~~A
// 23~~~B
// 23~~~A
// 24~~~A
// 24~~~B
// 25~~~A
// 25~~~B
// 26~~~A
// 26~~~B
// 27~~~B
// 27~~~A
// 28~~~A
// 28~~~B
// 29~~~A
// 29~~~B