public class P {
    public static void main(String[] args) throws InterruptedException{
      HThread x=new HThread() ;
       x.start();
  x.setName("A");
   Thread y=Thread.currentThread();
    for(int i=0;i<30;i++){
        if(i==20){
            x.join();
        }
        System.out.println(i +  " "+ y.getName());
    }
    }
}

class HThread extends Thread {
    public void run(){
  H1Thread x=new H1Thread() ;
       
   x.start();
  x.setName("B");
   Thread y=Thread.currentThread();
     
        for(int i=0;i<30;i++){
            
            if(i==20)try { 
                x.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            
        System.out.println(i + " run()-"+ y.getName());
    }
    }
}
class H1Thread extends Thread {
    public void run(){
  H2Thread x=new H2Thread() ;
       
   x.start();
  x.setName("C");
   Thread y=Thread.currentThread();
     
        for(int i=0;i<30;i++){
            
            if(i==20)try { 
                x.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            
        System.out.println(i + " run()-"+ y.getName());
    }
    }
}
class H2Thread extends Thread {
    public void run(){
    Thread y=Thread.currentThread();
      for(int i=0;i<30;i++){
    System.out.println(i + " run()-"+ y.getName());
    }
    }
}

// 0 run()-A
// 1 run()-A
// 2 run()-A
// 3 run()-A
// 4 run()-A
// 0 run()-C
// 1 run()-C
// 2 run()-C
// 3 run()-C
// 0 run()-B
// 1 run()-B
// 2 run()-B
// 0 main
// 5 run()-A
// 6 run()-A
// 4 run()-C
// 3 run()-B
// 1 main
// 7 run()-A
// 5 run()-C
// 4 run()-B
// 5 run()-B
// 2 main
// 8 run()-A
// 9 run()-A
// 6 run()-C
// 7 run()-C
// 6 run()-B
// 3 main
// 10 run()-A
// 8 run()-C
// 9 run()-C
// 7 run()-B
// 4 main
// 11 run()-A
// 10 run()-C
// 11 run()-C
// 12 run()-C
// 13 run()-C
// 14 run()-C
// 15 run()-C
// 16 run()-C
// 17 run()-C
// 18 run()-C
// 8 run()-B
// 5 main
// 6 main
// 7 main
// 8 main
// 9 main
// 12 run()-A
// 19 run()-C
// 20 run()-C
// 21 run()-C
// 22 run()-C
// 23 run()-C
// 24 run()-C
// 25 run()-C
// 26 run()-C
// 9 run()-B
// 10 run()-B
// 10 main
// 11 main
// 12 main
// 13 run()-A
// 14 run()-A
// 15 run()-A
// 27 run()-C
// 28 run()-C
// 11 run()-B
// 12 run()-B
// 13 run()-B
// 14 run()-B
// 15 run()-B
// 16 run()-B
// 17 run()-B
// 18 run()-B
// 19 run()-B
// 13 main
// 16 run()-A
// 29 run()-C
// 14 main
// 15 main
// 16 main
// 17 main
// 18 main
// 19 main
// 17 run()-A
// 18 run()-A
// 20 run()-B
// 19 run()-A
// 21 run()-B
// 22 run()-B
// 23 run()-B
// 24 run()-B
// 25 run()-B
// 26 run()-B
// 27 run()-B
// 28 run()-B
// 29 run()-B
// 20 run()-A
// 21 run()-A
// 22 run()-A
// 23 run()-A
// 24 run()-A
// 25 run()-A
// 26 run()-A
// 27 run()-A
// 28 run()-A
// 29 run()-A
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

