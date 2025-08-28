class LRunnable6 implements Runnable {
    public void run(){
       L.x.pro();
       }}

class LRunnable7 implements Runnable {
    public void run(){
        L.x.info();
       } }

public class L {
    static L x=new L();
    public static void main(String[] args) {
       Thread t1= new Thread(new LRunnable6(),"B") ;
        Thread t2= new Thread(new LRunnable7(),"A") ;
        t1.start();
        t2.start();
    }
     public  static synchronized  void pro(){
         Thread t=Thread.currentThread();
        for (int i = 0; i < 30; i++) {
   try {t.sleep(100); } catch (InterruptedException e) {}
   System.out.println(i+ "~~~"+t.getName() );}
     }
    
     public  synchronized void info(){
         Thread t=Thread.currentThread();
    for (int i = 0; i < 30; i++) {
        try { t.sleep(100);} catch (InterruptedException e) {}
 System.out.println(i+"~~~"+ t.getName());
     }
    }}
// }0~~~B
// 0~~~A
// 1~~~B
// 1~~~A
// 2~~~B
// 2~~~A
// 3~~~A
// 3~~~B
// 4~~~B
// 4~~~A
// 5~~~A
// 5~~~B
// 6~~~B
// 6~~~A
// 7~~~A
// 7~~~B
// 8~~~A
// 8~~~B
// 9~~~B
// 9~~~A
// 10~~~B
// 10~~~A
// 11~~~B
// 11~~~A
// 12~~~B
// 12~~~A
// 13~~~B
// 13~~~A
// 14~~~A
// 14~~~B
// 15~~~B
// 15~~~A
// 16~~~B
// 16~~~A
// 17~~~B
// 17~~~A
// 18~~~B
// 18~~~A
// 19~~~B
// 19~~~A
// 20~~~B
// 20~~~A
// 21~~~B
// 21~~~A
// 22~~~B
// 22~~~A
// 23~~~B
// 23~~~A
// 24~~~B
// 24~~~A
// 25~~~B
// 25~~~A
// 26~~~B
// 26~~~A
// 27~~~B
// 27~~~A
// 28~~~B
// 28~~~A
// 29~~~B
// 29~~~A