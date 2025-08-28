public class F {
   

   public static void main(String[] args) {
      AThread x = new AThread();
      x.run();
     x.setName("golu");
      Thread y = Thread.currentThread();

      for(int i = 0; i < 30; ++i) {
         System.out.println("" + i + "-main()-" + y.getName());
      }

   }
}
// 0 run()-main
// 1 run()-main
// 2 run()-main
// 3 run()-main
// 4 run()-main
// 5 run()-main
// 6 run()-main
// 7 run()-main
// 8 run()-main
// 9 run()-main
// 10 run()-main
// 11 run()-main
// 12 run()-main
// 13 run()-main
// 14 run()-main
// 15 run()-main
// 16 run()-main
// 17 run()-main
// 18 run()-main
// 19 run()-main
// 20 run()-main
// 21 run()-main
// 22 run()-main
// 23 run()-main
// 24 run()-main
// 25 run()-main
// 26 run()-main
// 27 run()-main
// 28 run()-main
// 29 run()-main
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