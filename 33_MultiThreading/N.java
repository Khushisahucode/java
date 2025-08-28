public class N {
    public static void main(String[] args) {
       mythread1 x=new mythread1() ;
       Thread y=new Thread(x,"golu");
   y.start();
  // y.setName("golu");
   Thread z=Thread.currentThread();
    for(int i=0;i<30;i++){
        System.out.println(i + " main()-"+ z.getName());
    }
    }
}
class mythread1 implements  Runnable {
    public void run(){

     Thread y=Thread.currentThread() ;
        for(int i=0;i<30;i++){
        System.out.println(i + " run()-"+ y.getName());
    }
    }
}
// 0 main()-main
// 1 main()-main
// 2 main()-main
// 3 main()-main
// 4 main()-main
// 0 run()-golu
// 1 run()-golu
// 5 main()-main
// 2 run()-golu
// 6 main()-main
// 3 run()-golu
// 7 main()-main
// 8 main()-main
// 9 main()-main
// 4 run()-golu
// 10 main()-main
// 11 main()-main
// 5 run()-golu
// 6 run()-golu
// 7 run()-golu
// 8 run()-golu
// 9 run()-golu
// 12 main()-main
// 13 main()-main
// 14 main()-main
// 15 main()-main
// 10 run()-golu
// 11 run()-golu
// 16 main()-main
// 12 run()-golu
// 13 run()-golu
// 17 main()-main
// 14 run()-golu
// 15 run()-golu
// 18 main()-main
// 19 main()-main
// 16 run()-golu
// 20 main()-main
// 21 main()-main
// 17 run()-golu
// 22 main()-main
// 23 main()-main
// 24 main()-main
// 18 run()-golu
// 19 run()-golu
// 20 run()-golu
// 21 run()-golu
// 22 run()-golu
// 25 main()-main
// 26 main()-main
// 23 run()-golu
// 24 run()-golu
// 25 run()-golu
// 27 main()-main
// 28 main()-main
// 26 run()-golu
// 27 run()-golu
// 29 main()-main
// 28 run()-golu
// 29 run()-golu
