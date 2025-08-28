class R{
    public static void main(String[]args) throws InterruptedException{
     System.out.println("A");
        RThread x=new RThread();
      Thread y=Thread.currentThread();
      y.join();
    }
}
class RThread extends Thread{
   public  void run(){
 }
}
// A
//cursor