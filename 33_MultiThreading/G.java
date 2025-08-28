public class G {
  public static void main(String[]args){
    AThread t=new AThread();
     t.start();
      t.setName("golu");
  t.start();
    Thread x=Thread.currentThread();
    for(int i=0;i<30;i++){
      System.out.println(i + "-main()-"+ x.getName());
    }
  }
}
class AThread extends Thread{
   public void run(){
     Thread x=Thread.currentThread();
    for(int i=0;i<30;i++){
      System.out.println(i + " run()-"+ x.getName());
    }
}}
// }Exception in thread "main" java.lang.IllegalThreadStateException
//         at java.base/java.lang.Thread.start(Thread.java:1517)
//         at G.main(G.java:8)
// 0 run()-golu
// 1 run()-golu
// 2 run()-golu
// 3 run()-golu
// 4 run()-golu
// 5 run()-golu
// 6 run()-golu
// 7 run()-golu
// 8 run()-golu
// 9 run()-golu
// 10 run()-golu
// 11 run()-golu
// 12 run()-golu
// 13 run()-golu
// 14 run()-golu
// 15 run()-golu
// 16 run()-golu
// 17 run()-golu
// 18 run()-golu
// 19 run()-golu
// 20 run()-golu
// 21 run()-golu
// 22 run()-golu
// 23 run()-golu
// 24 run()-golu
// 25 run()-golu
// 26 run()-golu
// 27 run()-golu
// 28 run()-golu
// 29 run()-golu