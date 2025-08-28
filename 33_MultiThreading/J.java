public class J{
  public static void main(String[]args){
    AThread t=new AThread();
     t.start();
 t.setName("rahul");
 
    Thread x=Thread.currentThread();
    for(int i=0;i<30;i++){
if(i==15){
    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    
}
      System.out.println(i + "-main()-"+ x.getName());
    }
  }}
// 1-main()-main
// 3 run()-rahul
// 2-main()-main
// 3-main()-main
// 4 run()-rahul
// 4-main()-main
// 5 run()-rahul
// 6 run()-rahul
// 7 run()-rahul
// 5-main()-main
// 8 run()-rahul
// 9 run()-rahul
// 6-main()-main
// 10 run()-rahul
// 11 run()-rahul
// 7-main()-main
// 8-main()-main
// 12 run()-rahul
// 13 run()-rahul
// 9-main()-main
// 14 run()-rahul
// 10-main()-main
// 15 run()-rahul
// 16 run()-rahul
// 17 run()-rahul
// 11-main()-main
// 18 run()-rahul
// 12-main()-main
// 13-main()-main
// 14-main()-main
// 19 run()-rahul
// 20 run()-rahul
// 21 run()-rahul
// 22 run()-rahul
// 23 run()-rahul
// 24 run()-rahul
// 25 run()-rahul
// 26 run()-rahul
// 27 run()-rahul
// 28 run()-rahul
// 29 run()-rahul
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