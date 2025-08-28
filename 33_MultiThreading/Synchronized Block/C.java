class CRunnable implements Runnable {
    public void run(){
       C.x1.pro();
       }}

class CRunnable2 implements Runnable {
    public void run(){
        C.x2.info();
       } }

public class C{
    static C x1=new C(); 
    static C x2= new C();
    public static void main(String[] args) {
       Thread t1= new Thread(new CRunnable(),"A") ;
        Thread t2= new Thread(new CRunnable2(),"C") ;
        t1.start();
        t2.start();
    }
       void pro(){
        String name =Thread.currentThread().getName();
         Thread t=Thread.currentThread();
         synchronized (this) {
             for (int i = 0; i < 30; i++) {
   try {t.sleep(100); } catch (InterruptedException e) {}
   System.out.println(i+ "~~~"+name );}
     }
       }
    void info(){String name =Thread.currentThread().getName();
         Thread t=Thread.currentThread();
         synchronized (this) {
    for (int i = 0; i < 30; i++) {
        try { t.sleep(100);} catch (InterruptedException e) {}
 System.out.println(i+"~~~"+ name);
     }}
    }}
// 0~~~A
// 0~~~C
// 1~~~A
// 1~~~C
// 2~~~C
// 2~~~A
// 3~~~A
// 3~~~C
// 4~~~C
// 4~~~A
// 5~~~C
// 5~~~A
// 6~~~C
// 6~~~A
// 7~~~A
// 7~~~C
// 8~~~A
// 8~~~C
// 9~~~A
// 9~~~C
// 10~~~A
// 10~~~C
// 11~~~A
// 11~~~C
// 12~~~A
// 12~~~C
// 13~~~A
// 13~~~C
// 14~~~A
// 14~~~C
// 15~~~A
// 15~~~C
// 16~~~A
// 16~~~C
// 17~~~A
// 17~~~C
// 18~~~A
// 18~~~C
// 19~~~A
// 19~~~C
// 20~~~A
// 20~~~C
// 21~~~A
// 21~~~C
// 22~~~A
// 22~~~C
// 23~~~A
// 23~~~C
// 24~~~A
// 24~~~C
// 25~~~A
// 25~~~C
// 26~~~A
// 26~~~C
// 27~~~A
// 27~~~C
// 28~~~A
// 28~~~C
// 29~~~A
// 29~~~C