 public class E {
  public static void main(String[]args){
    AThread t=new AThread();
     System.out.println(t.isAlive()+ " before isalive ()");
     t.start();
     t.setName("golu"); 
  System.out.println(t.isAlive() + " isalive()");
    Thread x=Thread.currentThread();
    System.out.println(x==t);//false
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
// 1 run()-golu
// 2 run()-golu
// 3 run()-golu
// 4 run()-golu
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
// 5 run()-golu
// 16-main()-main
// 6 run()-golu
// 7 run()-golu
// 17-main()-main
// 8 run()-golu
// 18-main()-main
// 9 run()-golu
// 10 run()-golu
// 11 run()-golu
// 12 run()-golu
// 13 run()-golu
// 14 run()-golu
// 19-main()-main
// 20-main()-main
// 21-main()-main
// 15 run()-golu
// 22-main()-main
// 16 run()-golu
// 17 run()-golu
// 18 run()-golu
// 19 run()-golu
// 20 run()-golu
// 23-main()-main
// 24-main()-main
// 21 run()-golu
// 22 run()-golu
// 23 run()-golu