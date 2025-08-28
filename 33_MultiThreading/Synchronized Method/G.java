class GRunnable implements Runnable {
    public void run(){
       for (int i = 0; i < 30; i++) {
           G.x.pro(i);
       }
    }
}
class GRunnable2 implements Runnable {
    public void run(){
       for (int i = 0; i < 30; i++) {
           G.y.info(i);
       }
    }
}
public class G {
    static G x=new G();
    static G y=new G();
    public static void main(String[] args) {
       Thread t1= new Thread(new GRunnable(),"B") ;
        Thread t2= new Thread(new GRunnable2(),"A") ;
        t1.start();
        t2.start();
    }
     public synchronized  void pro(int i){
   Thread t=Thread.currentThread();
   System.out.println(i+ "_"+t.getName() );
     }
     public synchronized void info(int i){
        Thread t=Thread.currentThread();
 System.out.println(i+"_"+ t.getName());
     }
}
// 0_B
// 0_A
// 1_A
// 2_A
// 3_A
// 4_A
// 5_A
// 1_B
// 6_A
// 7_A
// 8_A
// 9_A
// 2_B
// 3_B
// 4_B
// 5_B
// 6_B
// 7_B
// 8_B
// 9_B
// 10_B
// 11_B
// 12_B
// 13_B
// 10_A
// 14_B
// 11_A
// 12_A
// 13_A
// 14_A
// 15_B
// 15_A
// 16_A
// 17_A
// 16_B
// 17_B
// 18_B
// 18_A
// 19_A
// 20_A
// 19_B
// 21_A
// 22_A
// 23_A
// 20_B
// 24_A
// 25_A
// 26_A
// 21_B
// 22_B
// 27_A
// 28_A
// 29_A
// 23_B
// 24_B
// 25_B
// 26_B
// 27_B
// 28_B
// 29_B