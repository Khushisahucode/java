public class O {
    public static void main(String[] args) throws InterruptedException{
       myRunnable x=new myRunnable() ;
       Thread y=new Thread(x,"golu");
   y.start();
  
   Thread z=Thread.currentThread();
    for(int i=0;i<30;i++){
        if(i==20){
            y.join();
        }
        System.out.println(i +  " "+ z.getName());
    }
    }
}
class myRunnable implements  Runnable {
    public void run(){

     Thread y=Thread.currentThread() ;
        for(int i=0;i<30;i++){
            
        System.out.println(i + " run()-"+ y.getName());
    }
    }
}
// 0 run()-golu
// 1 run()-golu
// 2 run()-golu
// 3 run()-golu
// 0 main
// 4 run()-golu
// 5 run()-golu
// 6 run()-golu
// 1 main
// 7 run()-golu
// 2 main
// 8 run()-golu
// 3 main
// 4 main
// 9 run()-golu
// 5 main
// 10 run()-golu
// 6 main
// 11 run()-golu
// 7 main
// 12 run()-golu
// 8 main
// 13 run()-golu
// 9 main
// 10 main
// 14 run()-golu
// 15 run()-golu
// 16 run()-golu
// 11 main
// 17 run()-golu
// 12 main
// 18 run()-golu
// 13 main
// 19 run()-golu
// 20 run()-golu
// 21 run()-golu
// 22 run()-golu
// 23 run()-golu
// 24 run()-golu
// 14 main
// 15 main
// 16 main
// 17 main
// 18 main
// 19 main
// 25 run()-golu
// 26 run()-golu
// 27 run()-golu
// 28 run()-golu
// 29 run()-golu
// 20 main
// 21 main
// 22 main
// 23 main
// 24 main
// 25 main
// 26 main
// 27 main
// 28 main
// 29 main