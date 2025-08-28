public class K {
  public static void main(String[]args) throws InterruptedException{
    AThread a=new AThread();
    AThread b=new AThread();
     a.setName("golu"); 
     b.setName("bablu");
     a.start();
     b.start();
  
    Thread x=Thread.currentThread();
    b.sleep(5000); // compile time -----> Thread.sleep()=main()
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

  }
}
// 0 run()-golu
// 0 run()-bablu
// 1 run()-golu
// 1 run()-bablu
// 2 run()-golu
// 2 run()-bablu
// 3 run()-golu
// 3 run()-bablu
// 4 run()-golu
// 4 run()-bablu
// 5 run()-bablu
// 6 run()-bablu
// 7 run()-bablu
// 8 run()-bablu
// 5 run()-golu
// 9 run()-bablu
// 10 run()-bablu
// 6 run()-golu
// 11 run()-bablu
// 12 run()-bablu
// 13 run()-bablu
// 14 run()-bablu
// 15 run()-bablu
// 16 run()-bablu
// 17 run()-bablu
// 18 run()-bablu
// 19 run()-bablu
// 20 run()-bablu
// 21 run()-bablu
// 7 run()-golu
// 8 run()-golu
// 22 run()-bablu
// 23 run()-bablu
// 24 run()-bablu
// 25 run()-bablu
// 26 run()-bablu
// 27 run()-bablu
// 28 run()-bablu
// 29 run()-bablu
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
// 0-main()-main
// 1-main()-main
// 2-main()-main
// 3-main()-main
// 4-main()-main
// 5-main()-main
// 6-main()-main
// 7-main()-main
// 8-main()-main
// 9-main()-main
// 10-main()-main
// 11-main()-main
// 12-main()-main
// 13-main()-main
// 14-main()-main
// 15-main()-main
// 16-main()-main
// 17-main()-main
// 18-main()-main
// 19-main()-main
// 20-main()-main
// 21-main()-main
// 22-main()-main
// 23-main()-main
// 24-main()-main
// 25-main()-main
// 26-main()-main
// 27-main()-main
// 28-main()-main
// 29-main()-main