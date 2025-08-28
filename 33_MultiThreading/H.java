public class H{
  public static void main(String[]args){
    AThread t=new AThread();
     t.start();
    //  t.setName("raju");
  AThread t2=new AThread();
     t2.start();
     // t2.setName("kaliya");
      AThread t3=new AThread();
     t3.start();
    //  t3.setName("bheem");
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
// 0 run()-Thread-2
// 1 run()-Thread-2
// 2 run()-Thread-2
// 0 run()-Thread-0
// 1 run()-Thread-0
// 0-main()-main
// 0 run()-Thread-1
// 1 run()-Thread-1
// 2 run()-Thread-1
// 3 run()-Thread-2
// 2 run()-Thread-0
// 3 run()-Thread-0
// 1-main()-main
// 3 run()-Thread-1
// 4 run()-Thread-2
// 4 run()-Thread-0
// 2-main()-main
// 3-main()-main
// 4 run()-Thread-1
// 5 run()-Thread-1
// 5 run()-Thread-2
// 5 run()-Thread-0
// 4-main()-main
// 6 run()-Thread-1
// 6 run()-Thread-2
// 7 run()-Thread-2
// 8 run()-Thread-2
// 6 run()-Thread-0
// 7 run()-Thread-0
// 5-main()-main
// 6-main()-main
// 7-main()-main
// 7 run()-Thread-1
// 9 run()-Thread-2
// 8 run()-Thread-0
// 9 run()-Thread-0
// 8-main()-main
// 8 run()-Thread-1
// 9 run()-Thread-1
// 10 run()-Thread-1
// 11 run()-Thread-1
// 10 run()-Thread-2
// 10 run()-Thread-0
// 11 run()-Thread-0
// 9-main()-main
// 12 run()-Thread-1
// 11 run()-Thread-2
// 12 run()-Thread-2
// 12 run()-Thread-0
// 13 run()-Thread-0
// 14 run()-Thread-0
// 10-main()-main
// 11-main()-main
// 13 run()-Thread-1
// 13 run()-Thread-2
// 15 run()-Thread-0
// 12-main()-main
// 14 run()-Thread-1
// 15 run()-Thread-1
// 14 run()-Thread-2
// 15 run()-Thread-2
// 16 run()-Thread-2
// 17 run()-Thread-2
// 18 run()-Thread-2
// 19 run()-Thread-2
// 20 run()-Thread-2
// 21 run()-Thread-2
// 22 run()-Thread-2
// 23 run()-Thread-2
// 16 run()-Thread-0
// 13-main()-main
// 16 run()-Thread-1
// 24 run()-Thread-2
// 17 run()-Thread-0
// 14-main()-main
// 17 run()-Thread-1
// 25 run()-Thread-2
// 26 run()-Thread-2
// 27 run()-Thread-2
// 18 run()-Thread-0
// 15-main()-main
// 18 run()-Thread-1
// 19 run()-Thread-1
// 28 run()-Thread-2
// 19 run()-Thread-0
// 16-main()-main
// 20 run()-Thread-1
// 29 run()-Thread-2
// 20 run()-Thread-0
// 21 run()-Thread-0
// 17-main()-main
// 18-main()-main
// 21 run()-Thread-1
// 22 run()-Thread-0
// 19-main()-main
// 22 run()-Thread-1
// 23 run()-Thread-0
// 20-main()-main
// 23 run()-Thread-1
// 24 run()-Thread-1
// 25 run()-Thread-1
// 26 run()-Thread-1
// 27 run()-Thread-1
// 28 run()-Thread-1
// 24 run()-Thread-0
// 21-main()-main
// 29 run()-Thread-1
// 25 run()-Thread-0
// 26 run()-Thread-0
// 22-main()-main
// 23-main()-main
// 24-main()-main
// 27 run()-Thread-0
// 25-main()-main
// 26-main()-main
// 28 run()-Thread-0
// 29 run()-Thread-0
// 27-main()-main
// 28-main()-main
// 29-main()-main