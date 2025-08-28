public class I{
  public static void main(String[]args){
    AThread t=new AThread();
     t.start();
 t.setName("raju");
  AThread t2=new AThread();
     t2.start();
     t2.setName("kaliya");
      AThread t3=new AThread();
     t3.start();
      t3.setName("bheem");
    Thread x=Thread.currentThread();
    for(int i=0;i<30;i++){
      System.out.println(i + "-main()-"+ x.getName());
    }
  }}
// 0 run()-kaliya
// 1 run()-kaliya
// 2 run()-kaliya
// 3 run()-kaliya
// 0 run()-raju
// 0-main()-main
// 0 run()-bheem
// 4 run()-kaliya
// 5 run()-kaliya
// 1 run()-raju
// 1-main()-main
// 2-main()-main
// 1 run()-bheem
// 6 run()-kaliya
// 2 run()-raju
// 3-main()-main
// 2 run()-bheem
// 7 run()-kaliya
// 3 run()-raju
// 4-main()-main
// 5-main()-main
// 3 run()-bheem
// 8 run()-kaliya
// 4 run()-raju
// 6-main()-main
// 4 run()-bheem
// 9 run()-kaliya
// 5 run()-raju
// 7-main()-main
// 5 run()-bheem
// 10 run()-kaliya
// 6 run()-raju
// 7 run()-raju
// 8-main()-main
// 6 run()-bheem
// 11 run()-kaliya
// 8 run()-raju
// 9-main()-main
// 10-main()-main
// 7 run()-bheem
// 12 run()-kaliya
// 9 run()-raju
// 11-main()-main
// 8 run()-bheem
// 13 run()-kaliya
// 10 run()-raju
// 12-main()-main
// 9 run()-bheem
// 10 run()-bheem
// 14 run()-kaliya
// 11 run()-raju
// 13-main()-main
// 11 run()-bheem
// 12 run()-bheem
// 13 run()-bheem
// 15 run()-kaliya
// 16 run()-kaliya
// 12 run()-raju
// 13 run()-raju
// 14 run()-raju
// 15 run()-raju
// 16 run()-raju
// 14-main()-main
// 14 run()-bheem
// 17 run()-kaliya
// 17 run()-raju
// 15-main()-main
// 15 run()-bheem
// 18 run()-kaliya
// 19 run()-kaliya
// 20 run()-kaliya
// 21 run()-kaliya
// 22 run()-kaliya
// 23 run()-kaliya
// 18 run()-raju
// 16-main()-main
// 16 run()-bheem
// 24 run()-kaliya
// 19 run()-raju
// 17-main()-main
// 17 run()-bheem
// 25 run()-kaliya
// 20 run()-raju
// 18-main()-main
// 19-main()-main
// 18 run()-bheem
// 26 run()-kaliya
// 21 run()-raju
// 20-main()-main
// 19 run()-bheem
// 27 run()-kaliya
// 22 run()-raju
// 21-main()-main
// 20 run()-bheem
// 28 run()-kaliya
// 23 run()-raju
// 22-main()-main
// 21 run()-bheem
// 22 run()-bheem
// 23 run()-bheem
// 29 run()-kaliya
// 24 run()-raju
// 23-main()-main
// 24 run()-bheem
// 25 run()-raju
// 24-main()-main
// 25 run()-bheem
// 26 run()-bheem
// 27 run()-bheem
// 26 run()-raju
// 25-main()-main
// 28 run()-bheem
// 27 run()-raju
// 26-main()-main
// 29 run()-bheem
// 28 run()-raju
// 27-main()-main
// 28-main()-main
// 29-main()-main
// 29 run()-raju